package net.hp.healthcare.job;

import java.util.Date;

import org.dom4j.Document;

import net.hp.healthcare.utils.Contains;
import net.hp.healthcare.utils.DateUtils;
import net.hp.healthcare.utils.WebServiceUtil;

public class DepartmentJob extends Job{
	
	public void execute(){
		logger.info("科室信息同步开始");
		Date updateDate = this.getLastSyncTime(Contains.MethodName_WS_HP_DEPARTMENT);
		Date sysdate = new Date();
		logger.info("上次同步时间：" + DateUtils.castDateToString(updateDate));
		try {
			Document document = WebServiceUtil.WS_HP_DEPARTMENT(DateUtils.castDateToString(updateDate), DateUtils.castDateToString(sysdate));
			this.saveOrUpdate(Contains.TableName_VWINF_HP_DEPARTMENT, document.getRootElement());
			this.updateLastSyncTime(sysdate, Contains.MethodName_WS_HP_DEPARTMENT);
		} catch(Exception e){
			logger.error(e.getMessage(),e);
		}
		logger.info("科室信息同步结束");
	}
}
