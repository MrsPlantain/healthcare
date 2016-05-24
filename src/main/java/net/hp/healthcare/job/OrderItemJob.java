package net.hp.healthcare.job;

import java.util.Date;

import org.dom4j.Document;

import net.hp.healthcare.utils.Contains;
import net.hp.healthcare.utils.DateUtils;
import net.hp.healthcare.utils.WebServiceUtil;

public class OrderItemJob extends Job {

	@Override
	public void execute() {
		logger.info("检验(申请单)表同步开始");
		Date updateDate = this.getLastSyncTime(Contains.MethodName_WS_HP_ORDER_ITEM);
		Date sysdate = new Date();
		logger.info("上次同步时间：" + DateUtils.castDateToString(updateDate));
		try{
			Document document = WebServiceUtil.WS_HP_ORDER_ITEM(DateUtils.castDateToString(updateDate), DateUtils.castDateToString(sysdate), null);
			this.saveOrUpdate(Contains.TableName_VWINF_HP_ORDER_ITEM, document.getRootElement());
			this.updateLastSyncTime(sysdate, Contains.MethodName_WS_HP_ORDER_ITEM);
		}catch(Exception e){
			logger.error(e.getMessage(),e);
		}

		logger.info("检验(申请单)表同步结束");

	}

}
