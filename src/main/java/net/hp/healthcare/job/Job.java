package net.hp.healthcare.job;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.dom4j.Element;
import org.springframework.jdbc.core.JdbcTemplate;

import net.hp.healthcare.utils.Contains;
import net.hp.healthcare.utils.JdbcTemplateAdapter;
import net.hp.healthcare.utils.PropertiesUtil;

public abstract class Job{

	protected final Logger logger = LogManager.getLogger(this.getClass());
	protected final String SQL_LAST_SYNC_DATE = "SELECT UPDATE_TIME FROM HIS_HP_UPDATEDTIME WHERE METHOD_NAME = ?";
	protected final String SQL_UPDATE_LAST_SYNC_DATE = "UPDATE HIS_HP_UPDATEDTIME SET UPDATE_TIME = ? WHERE METHOD_NAME = ?";
	protected JdbcTemplate jdbcTemplate;
	protected JdbcTemplateAdapter adapter = null;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		adapter = new JdbcTemplateAdapter(jdbcTemplate);
	}
	
	/**
	 * 方法说明：获取上次同步时间 . <BR>
	 * @see net.hp.healthcare.job.Job <BR>
	 * @param methodName
	 * @return
	 * @return: Date
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月14日 下午1:46:26 <BR>
	 */
	protected Date getLastSyncTime(String methodName) {
		return this.jdbcTemplate.queryForObject(SQL_LAST_SYNC_DATE, new Object[]{methodName}, Date.class);
	}
	
	/**
	 * 方法说明： 更新上次同步时间. <BR>
	 * @see net.hp.healthcare.job.Job <BR>
	 * @param sysdate
	 * @param methodName
	 * @return: void
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月14日 下午1:47:53 <BR>
	 */
	protected void updateLastSyncTime(Date sysdate,String methodName) {
		this.jdbcTemplate.update(SQL_UPDATE_LAST_SYNC_DATE, new Object[]{sysdate,methodName});
	}
	
	protected void createDataMap(Map<String,Object> dataMap,Properties prop,Element node){
		Iterator<Object> it = prop.keySet().iterator();
		while(it.hasNext()){
			String key = (String) it.next();
			if (!"TABLE_ID".equals(key))dataMap.put(prop.getProperty(key), node.elementText(key) == null ? "" : node.elementText(key));
		}
	}
	
	
	@SuppressWarnings("unchecked")
	protected void saveOrUpdate(String tableName,Element root){
		int count = 0;
		int errorcount = 0;
		Iterator<Element> it = root.element("OUTPUT").elementIterator();
		while(it.hasNext()){
			Element item = it.next();
			if ("ITEMS".equals(item.getName())) {
				Iterator<Element> nodes = item.elementIterator();
				while (nodes.hasNext()) {
					Element node = nodes.next();
					try {
						logger.debug(node.asXML());
						Properties prop = PropertiesUtil.prop(Contains.CONFIGFLODER + File.separatorChar + tableName + Contains.TYPE_PROP);
						Map<String, Object> dataMap = new HashMap<String, Object>();
						dataMap.put("TABLE_NAME", tableName);
						dataMap.put("TABLE_ID", prop.get("TABLE_ID"));
						this.createDataMap(dataMap, prop, node);
						this.adapter.saveOrUpdate(dataMap);
						count++;
					} catch (Exception e) {
						logger.error(node.asXML());
						logger.error(e.getMessage(), e);
						errorcount++;
					}
				}
			} else if ("ERROR_CODE".equals(item.getName())) {
				if (!"0".equals(item.getText())) {
					logger.error(item.getParent().elementText("ERROR_MESSAGE"));
				}
			}
		}
		logger.info("导入数据" + count + "条");
		logger.info("错误数据" + errorcount + "条");
	}
	
	public abstract void execute();
}