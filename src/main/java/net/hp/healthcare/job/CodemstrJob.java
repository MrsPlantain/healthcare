package net.hp.healthcare.job;

import java.util.Date;

import org.dom4j.Document;

import net.hp.healthcare.utils.Contains;
import net.hp.healthcare.utils.DateUtils;
import net.hp.healthcare.utils.WebServiceUtil;

public class CodemstrJob extends Job {

	@Override
	public void execute() {
		logger.info("字典信息同步开始");
		Date updateDate = this.getLastSyncTime(Contains.MethodName_WS_HP_CODEMSTR);
		Date sysdate = new Date();
		logger.info("上次同步时间：" + DateUtils.castDateToString(updateDate));
		try{
			Document document = WebServiceUtil.WS_HP_CODEMSTR(DateUtils.castDateToString(updateDate), DateUtils.castDateToString(sysdate));
			this.saveOrUpdate(Contains.TableName_VWINF_HP_CODEMSTR, document.getRootElement());
			this.updateLastSyncTime(sysdate, Contains.MethodName_WS_HP_CODEMSTR);
		}catch(Exception e){
			logger.error(e.getMessage(),e);
		}

		logger.info("字典信息同步结束");

	}

}
