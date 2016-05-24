package net.hp.healthcare.job;

import java.util.Date;

import org.dom4j.Document;

import net.hp.healthcare.utils.Contains;
import net.hp.healthcare.utils.DateUtils;
import net.hp.healthcare.utils.WebServiceUtil;

public class VisitJob extends Job {

	@Override
	public void execute() {
		logger.info("住院急诊门诊记录信息同步开始");
		Date updateDate = this.getLastSyncTime(Contains.MethodName_WS_HP_VISIT);
		Date sysdate = new Date();
		logger.info("上次同步时间：" + DateUtils.castDateToString(updateDate));
		try{
			Document document = WebServiceUtil.WS_HP_VISIT(DateUtils.castDateToString(updateDate), DateUtils.castDateToString(sysdate), null);
			this.saveOrUpdate(Contains.TableName_VWINF_HP_VISIT, document.getRootElement());
			this.updateLastSyncTime(sysdate, Contains.MethodName_WS_HP_VISIT);
		}catch(Exception e){
			logger.error(e.getMessage(),e);
		}

		logger.info("住院急诊门诊记录信息同步结束");

	}

}
