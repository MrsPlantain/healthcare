package net.hp.healthcare.job;

import java.util.Date;

import org.dom4j.Document;

import net.hp.healthcare.utils.Contains;
import net.hp.healthcare.utils.DateUtils;
import net.hp.healthcare.utils.WebServiceUtil;

public class BillJob extends Job {

	@Override
	public void execute() {
		logger.info("�˵���Ϣͬ����ʼ");
		Date updateDate = this.getLastSyncTime(Contains.MethodName_WS_HP_BILL);
		Date sysdate = new Date();
		logger.info("�ϴ�ͬ��ʱ�䣺" + DateUtils.castDateToString(updateDate));
		try{
			Document document = WebServiceUtil.WS_HP_BILL(DateUtils.castDateToString(updateDate), DateUtils.castDateToString(sysdate), null, null);
			this.saveOrUpdate(Contains.TableName_VWINF_HP_BILL, document.getRootElement());
			this.updateLastSyncTime(sysdate, Contains.MethodName_WS_HP_BILL);
		}catch(Exception e){
			logger.error(e.getMessage(),e);
		}

		logger.info("�˵���Ϣͬ������");

	}

}
