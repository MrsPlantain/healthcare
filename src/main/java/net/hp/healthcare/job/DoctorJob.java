package net.hp.healthcare.job;

import java.util.Date;

import org.dom4j.Document;

import net.hp.healthcare.utils.Contains;
import net.hp.healthcare.utils.DateUtils;
import net.hp.healthcare.utils.WebServiceUtil;

public class DoctorJob extends Job{
	
	public void execute() {
		logger.info("ҽ����Ϣͬ����ʼ");
		Date updateDate = this.getLastSyncTime(Contains.MethodName_WS_HP_DOCTOR);
		Date sysdate = new Date();
		logger.info("�ϴ�ͬ��ʱ��" + DateUtils.castDateToString(updateDate));
		try{
			Document document = WebServiceUtil.WS_HP_DOCTOR(DateUtils.castDateToString(updateDate), DateUtils.castDateToString(sysdate));
			this.saveOrUpdate(Contains.TableName_VWINF_HP_DOCTOR, document.getRootElement());
			this.updateLastSyncTime(sysdate, Contains.MethodName_WS_HP_DOCTOR);
		}catch(Exception e){
			logger.error(e.getMessage(),e);
		}
		logger.info("ҽ����Ϣͬ������");
	}

}
