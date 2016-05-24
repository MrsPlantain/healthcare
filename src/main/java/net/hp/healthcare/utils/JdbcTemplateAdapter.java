package net.hp.healthcare.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateAdapter {
	
	private static final Logger logger = LogManager.getLogger(JdbcTemplateAdapter.class);

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplateAdapter(JdbcTemplate _jdbcTemplate){
		jdbcTemplate = _jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/**
	 * TODO ����õ������ݡ�
	 * �������:
	 * 1.�����޸ģ�����ϵͳ�д��ڴ������ݡ�ID�ܶԵ��ϡ��޸ĵ�ǰ����
	 * 2.����������ϵͳ�в����ڴ������ݡ���������
	 */
	public boolean saveOrUpdate(Map<String,Object> dataMap){
		logger.debug(dataMap);
		StringBuffer sql = new StringBuffer("select * from ");
		StringBuffer sql_update = new StringBuffer("update ");
		StringBuffer sql_insert = new StringBuffer("insert into ");
		String tableName = dataMap.get("TABLE_NAME").toString();

		Properties jdbc = PropertiesUtil.prop(Contains.CONFIGFLODER + File.separatorChar + tableName + Contains.TYPE_JDBC);
		
		dataMap.remove("TABLE_NAME");
		Object ID = dataMap.get("TABLE_ID");
		dataMap.remove("TABLE_ID");
		Object idData = dataMap.get(ID.toString());
		sql.append(" ").append(tableName).append(" where ").append(ID.toString()).append(" = '").append(idData).append("'");
		List<Map<String, Object>> list = this.jdbcTemplate.queryForList(sql.toString());
		
		List<Object> params = new ArrayList<Object>();
		if (list != null && !list.isEmpty()) {// ���1
			dataMap.remove(ID);
			sql_update.append(tableName).append(" set ");
			Iterator<String> it = dataMap.keySet().iterator();
			while (it.hasNext()) {
				String datakey = it.next();
				if (!datakey.equals(ID)) {
					sql_update.append(datakey).append("=").append("?");
					String type = jdbc.getProperty(datakey);
					params.add(Contains.DATE.equals(type)
							? DateUtils.castStringToDate(String.valueOf(dataMap.get(datakey)),"yyyy-MM-dd") 
									: Contains.TIME.equals(type) ? 
											DateUtils.castStringToDate(String.valueOf(dataMap.get(datakey)))
										    : dataMap.get(datakey));
					if (it.hasNext()) {
						sql_update.append(",");
					}
				}
			}
			sql_update.append(" where ").append(ID.toString()).append(" = ?");
			params.add(idData);
			logger.info(sql_update);
			logger.info("Params>>"+params);
			this.jdbcTemplate.update(sql_update.toString(), params.toArray());
		} else {// ���2
			sql_insert.append(tableName).append("(");
			StringBuffer values = new StringBuffer(") VALUES (");
			Iterator<String> it = dataMap.keySet().iterator();
			while (it.hasNext()) {
				String datakey = it.next();
				sql_insert.append(datakey);
				values.append("?");
				String type = jdbc.getProperty(datakey);
				params.add(Contains.DATE.equals(type)
						? DateUtils.castStringToDate(String.valueOf(dataMap.get(datakey)),"yyyy-MM-dd") 
								: Contains.TIME.equals(type) ? 
										DateUtils.castStringToDate(String.valueOf(dataMap.get(datakey)))
									    : dataMap.get(datakey));
				if (it.hasNext()) {
					sql_insert.append(",");
					values.append(",");
				}
			}
			values.append(')');
			sql_insert.append(values);
			logger.info(sql_insert);
			logger.info("Params>>"+params);
			this.jdbcTemplate.update(sql_insert.toString(), params.toArray());
		}
		return false;
	}
	
}
