package net.hp.healthcare.utils;

import java.rmi.RemoteException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.tree.DefaultElement;

import com.kompakar.ehealth.base.exception.BusinessException;
import com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServicePortType;
import com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServicePortTypeProxy;

/**
 * 功能描述：  接口工具类.  <BR>
 * 开发者: chaolijuan  <BR>
 * 时间：2016年3月9日 下午5:53:57  <BR>
 * 描述：   <BR>
 */
public class WebServiceUtil {
	
	private static IMingDeAppInterfaceWsServicePortType app = new IMingDeAppInterfaceWsServicePortTypeProxy();
	private static Logger logger = LogManager.getLogger(WebServiceUtil.class);
	/**
	 * 方法说明： 患者信息. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param patientId 患者ID
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:28:04 <BR>
	 */
	public static Document WS_HP_PATIENT(String patientId,String startTime,String endTime) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("PATIENT_ID", patientId));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_PATIENT(doc.getDocument().asXML()));
	}
	
	/**
	 * 方法说明： 科室信息. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:29:45 <BR>
	 */
	public static Document WS_HP_DEPARTMENT(String startTime,String endTime) throws BusinessException, RemoteException, DocumentException{
		
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_DEPARTMENT(doc.getDocument().asXML()));
	}
	
	/**
	 * 方法说明： 医生信息. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:31:27 <BR>
	 */
	public static Document WS_HP_DOCTOR(String startTime,String endTime) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_DOCTOR(doc.getDocument().asXML()));
	}
	/**
	 * 方法说明： 字典表信息. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:32:15 <BR>
	 */
	public static Document WS_HP_CODEMSTR(String startTime,String endTime) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_CODEMSTR(doc.getDocument().asXML()));
	}

	/**
	 * 方法说明： 排班信息. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @param RESOURCESCHEME_ID 排班记录ID
	 * @param RESOURCEMSTR_ID 资源ID
	 * @param CAREPROVIDER_ID 医生ID
	 * @param REGN_DATE 排班日期
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:33:08 <BR>
	 */
	public static Document WS_HP_DUTY(String startTime, String endTime, String RESOURCESCHEME_ID,
			String RESOURCEMSTR_ID,String CAREPROVIDER_ID,String REGN_DATE) throws BusinessException, RemoteException, DocumentException {
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		doc.add(WebServiceUtil.createElement("RESOURCESCHEME_ID", RESOURCESCHEME_ID));
		doc.add(WebServiceUtil.createElement("RESOURCEMSTR_ID", RESOURCEMSTR_ID));
		doc.add(WebServiceUtil.createElement("CAREPROVIDER_ID", CAREPROVIDER_ID));
		doc.add(WebServiceUtil.createElement("REGN_DATE", REGN_DATE));
		logger.debug("WS_HP_DUTY::" + doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_DUTY(doc.getDocument().asXML()));
	}
	/**
	 * 方法说明： 停诊信息. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @param RESOURCEMSTR_ID 资源ID
	 * @param SUBSPECIALTYMSTR_ID 科室ID
	 * @param STOP_DATE 停诊时间
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:34:22 <BR>
	 */
	public static Document WS_HP_ABROGATE(String startTime,String endTime,String RESOURCEMSTR_ID,
			String SUBSPECIALTYMSTR_ID,String STOP_DATE) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		doc.add(WebServiceUtil.createElement("RESOURCEMSTR_ID", RESOURCEMSTR_ID));
		doc.add(WebServiceUtil.createElement("SUBSPECIALTYMSTR_ID", SUBSPECIALTYMSTR_ID));
		doc.add(WebServiceUtil.createElement("STOP_DATE", STOP_DATE));
		logger.debug("WS_HP_ABROGATE::" + doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_ABROGATE(doc.getDocument().asXML()));
	}
	/**
	 * 方法说明： 预约记录信息. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @param APPOINTMENT_ID 预约ID
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:35:25 <BR>
	 */
	public static Document WS_HP_APPOINTMENT(String startTime,String endTime,String APPOINTMENT_ID) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		doc.add(WebServiceUtil.createElement("APPOINTMENT_ID", APPOINTMENT_ID));
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_APPOINTMENT(doc.getDocument().asXML()));
	}
	/**
	 * 方法说明： 门急诊住院记录信息. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @param visitId 就诊记录ID
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:36:25 <BR>
	 */
	public static Document WS_HP_VISIT(String startTime,String endTime,String visitId) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		doc.add(WebServiceUtil.createElement("VISIT_ID", visitId));
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_VISIT(doc.getDocument().asXML()));
	}
	/**
	 * 方法说明： 应付信息. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @param id 账单ID
	 * @param patientId 患者ID
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:37:32 <BR>
	 */
	public static Document WS_HP_BILL(String startTime,String endTime,String id,String patientId) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		doc.add(WebServiceUtil.createElement("ID", id));
		doc.add(WebServiceUtil.createElement("PATIENT_ID", patientId));
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_BILL(doc.getDocument().asXML()));
	}
	/**
	 * 方法说明： 应付明细信息. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @param billId 账单ID
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:38:20 <BR>
	 */
	public static Document WS_HP_BILL_DETAIL(String startTime,String endTime,String billId) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		doc.add(WebServiceUtil.createElement("BILL_ID", billId));
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_BILL_DETAIL(doc.getDocument().asXML()));
	}
	/**
	 * 方法说明： 检验（申请单）信息. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @param REQUISITION_NO 申请ID
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:39:12 <BR>
	 */
	public static Document WS_HP_ORDER_ITEM(String startTime,String endTime,String REQUISITION_NO) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		doc.add(WebServiceUtil.createElement("REQUISITION_NO", REQUISITION_NO));
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_ORDER_ITEM(doc.getDocument().asXML()));
	}
	/**
	 * 方法说明： 检验结果. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @param LISRESULT_ID Lis结果ID
	 * @param LAB_REQUISITION_ID 申请单号
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:40:05 <BR>
	 */
	public static Document WS_HP_LIS_RESULT(String startTime,String endTime,String LISRESULT_ID,String LAB_REQUISITION_ID) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		doc.add(WebServiceUtil.createElement("LISRESULT_ID", LISRESULT_ID));
		doc.add(WebServiceUtil.createElement("LAB_REQUISITION_ID", LAB_REQUISITION_ID));
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_LIS_RESULT(doc.getDocument().asXML()));
	}
	/**
	 * 方法说明： 细菌检验结果信息. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime 查询最后更新的起始时间
	 * @param endTime 查询最后更新的结束时间
	 * @param LISRESULT_ID Lis结果ID
	 * @param LAB_REQUISITION_ID 申请单号
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午11:41:09 <BR>
	 */
	public static Document WS_HP_LIS_RESULTBAC(String startTime,String endTime,String LISRESULT_ID,
			String LAB_REQUISITION_ID) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		doc.add(WebServiceUtil.createElement("LISRESULT_ID", LISRESULT_ID));
		doc.add(WebServiceUtil.createElement("LAB_REQUISITION_ID", LAB_REQUISITION_ID));
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_LIS_RESULTBAC(doc.getDocument().asXML()));
	}
	
	/**
	 * 方法说明： 创建一个文档模板. <BR>
	 * <p>格式为：
	 * 	<?xml version="1.0" encoding="UTF-8"?>
	 *	<ROOT><INPUT><SEARCH/></INPUT></ROOT>
	 * </p>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @return 返回这个文档模板的叶子结点SEARCH
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午10:18:56 <BR>
	 */
	public static Element createDocument(){
		Document document = DocumentHelper.createDocument();
		return document.addElement("ROOT").addElement("INPUT").addElement("SEARCH");
	}
	
	/**
	 * 方法说明： 创建一个文档节点. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param name 节点名称
	 * @param text 节点内容
	 * @return
	 * @return: Element
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月10日 上午10:52:54 <BR>
	 */
	public static Element createElement(String name,String text){
		Element element = new DefaultElement(name);
		if(text != null && text.length() > 0)element.setText(text);
		return element;
	}
	
	public static void main(String[] args) {
		System.out.println(WebServiceUtil.createDocument().getDocument().asXML());
	}

}
