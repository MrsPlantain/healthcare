package net.hp.healthcare.job;

import java.util.Date;

import org.dom4j.Document;

import net.hp.healthcare.utils.Contains;
import net.hp.healthcare.utils.DateUtils;
import net.hp.healthcare.utils.WebServiceUtil;

public class BillDetailJob extends Job {

	@Override
	public void execute() {
		logger.info("�˵�������Ϣͬ����ʼ");
		Date updateDate = this.getLastSyncTime(Contains.MethodName_WS_HP_BILL_DETAIL);
		Date sysdate = new Date();
		logger.info("�ϴ�ͬ��ʱ�䣺" + DateUtils.castDateToString(updateDate));
		try{
			Document document = WebServiceUtil.WS_HP_BILL_DETAIL(DateUtils.castDateToString(updateDate), DateUtils.castDateToString(sysdate), null);
			this.saveOrUpdate(Contains.TableName_VWINF_HP_BILL_DETAIL, document.getRootElement());
			this.updateLastSyncTime(sysdate, Contains.MethodName_WS_HP_BILL_DETAIL);
		}catch(Exception e){
			logger.error(e.getMessage(),e);
		}

		logger.info("�˵�������Ϣͬ������");

	}

}
