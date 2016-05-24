package net.hp.healthcare.job;

import java.util.Date;

import org.dom4j.Document;

import net.hp.healthcare.utils.Contains;
import net.hp.healthcare.utils.DateUtils;
import net.hp.healthcare.utils.WebServiceUtil;

public class VisitJob extends Job {

	@Override
	public void execute() {
		logger.info("סԺ���������¼��Ϣͬ����ʼ");
		Date updateDate = this.getLastSyncTime(Contains.MethodName_WS_HP_VISIT);
		Date sysdate = new Date();
		logger.info("�ϴ�ͬ��ʱ�䣺" + DateUtils.castDateToString(updateDate));
		try{
			Document document = WebServiceUtil.WS_HP_VISIT(DateUtils.castDateToString(updateDate), DateUtils.castDateToString(sysdate), null);
			this.saveOrUpdate(Contains.TableName_VWINF_HP_VISIT, document.getRootElement());
			this.updateLastSyncTime(sysdate, Contains.MethodName_WS_HP_VISIT);
		}catch(Exception e){
			logger.error(e.getMessage(),e);
		}

		logger.info("סԺ���������¼��Ϣͬ������");

	}

}
