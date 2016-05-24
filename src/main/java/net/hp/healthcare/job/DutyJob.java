package net.hp.healthcare.job;

import java.util.Date;

import org.dom4j.Document;

import net.hp.healthcare.utils.Contains;
import net.hp.healthcare.utils.DateUtils;
import net.hp.healthcare.utils.WebServiceUtil;

public class DutyJob extends Job {

	@Override
	public void execute() {
		logger.info("�Ű���Ϣͬ����ʼ");
		Date updateDate = this.getLastSyncTime(Contains.MethodName_WS_HP_DUTY);
		Date sysdate = new Date();
		logger.info("�ϴ�ͬ��ʱ�䣺" + DateUtils.castDateToString(updateDate));
		try{
			Document document = WebServiceUtil.WS_HP_DUTY(DateUtils.castDateToString(updateDate), DateUtils.castDateToString(sysdate), null, null, null, null);
			this.saveOrUpdate(Contains.TableName_VWINF_HP_DUTY, document.getRootElement());
			this.updateLastSyncTime(sysdate, Contains.MethodName_WS_HP_DUTY);
		}catch(Exception e){
			logger.error(e.getMessage(),e);
		}

		logger.info("�Ű�ͬ������");
	}

}
