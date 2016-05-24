package net.hp.healthcare.job;

import java.util.Date;

import org.dom4j.Document;

import net.hp.healthcare.utils.Contains;
import net.hp.healthcare.utils.DateUtils;
import net.hp.healthcare.utils.WebServiceUtil;

public class PatientJob extends Job {

	@Override
	public void execute() {
		logger.info("患者信息同步开始");
		Date updateDate = this.getLastSyncTime(Contains.MethodName_WS_HP_PATIENT);
		Date sysdate = new Date();
		logger.info("上次同步时间：" + DateUtils.castDateToString(updateDate));
		try{
			Document document = WebServiceUtil.WS_HP_PATIENT(null, DateUtils.castDateToString(updateDate), DateUtils.castDateToString(sysdate));
			this.saveOrUpdate(Contains.TableName_VWINF_HP_PATIENT, document.getRootElement());
			this.updateLastSyncTime(sysdate, Contains.MethodName_WS_HP_PATIENT);
		}catch(Exception e){
			logger.error(e.getMessage(),e);
		}

		logger.info("患者信息同步结束");

	}

}
