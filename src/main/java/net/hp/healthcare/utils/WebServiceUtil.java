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
 * ����������  �ӿڹ�����.  <BR>
 * ������: chaolijuan  <BR>
 * ʱ�䣺2016��3��9�� ����5:53:57  <BR>
 * ������   <BR>
 */
public class WebServiceUtil {
	
	private static IMingDeAppInterfaceWsServicePortType app = new IMingDeAppInterfaceWsServicePortTypeProxy();
	private static Logger logger = LogManager.getLogger(WebServiceUtil.class);
	/**
	 * ����˵���� ������Ϣ. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param patientId ����ID
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:28:04 <BR>
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
	 * ����˵���� ������Ϣ. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:29:45 <BR>
	 */
	public static Document WS_HP_DEPARTMENT(String startTime,String endTime) throws BusinessException, RemoteException, DocumentException{
		
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_DEPARTMENT(doc.getDocument().asXML()));
	}
	
	/**
	 * ����˵���� ҽ����Ϣ. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:31:27 <BR>
	 */
	public static Document WS_HP_DOCTOR(String startTime,String endTime) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_DOCTOR(doc.getDocument().asXML()));
	}
	/**
	 * ����˵���� �ֵ����Ϣ. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:32:15 <BR>
	 */
	public static Document WS_HP_CODEMSTR(String startTime,String endTime) throws BusinessException, RemoteException, DocumentException{
		Element doc = WebServiceUtil.createDocument();
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_STARTDATE", startTime));
		doc.add(WebServiceUtil.createElement("LAST_UPDATED_ENDDATE", endTime));
		logger.debug(doc.getDocument().asXML());
		return DocumentHelper.parseText(app.WS_HP_CODEMSTR(doc.getDocument().asXML()));
	}

	/**
	 * ����˵���� �Ű���Ϣ. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @param RESOURCESCHEME_ID �Ű��¼ID
	 * @param RESOURCEMSTR_ID ��ԴID
	 * @param CAREPROVIDER_ID ҽ��ID
	 * @param REGN_DATE �Ű�����
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:33:08 <BR>
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
	 * ����˵���� ͣ����Ϣ. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @param RESOURCEMSTR_ID ��ԴID
	 * @param SUBSPECIALTYMSTR_ID ����ID
	 * @param STOP_DATE ͣ��ʱ��
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:34:22 <BR>
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
	 * ����˵���� ԤԼ��¼��Ϣ. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @param APPOINTMENT_ID ԤԼID
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:35:25 <BR>
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
	 * ����˵���� �ż���סԺ��¼��Ϣ. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @param visitId �����¼ID
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:36:25 <BR>
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
	 * ����˵���� Ӧ����Ϣ. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @param id �˵�ID
	 * @param patientId ����ID
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:37:32 <BR>
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
	 * ����˵���� Ӧ����ϸ��Ϣ. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @param billId �˵�ID
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:38:20 <BR>
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
	 * ����˵���� ���飨���뵥����Ϣ. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @param REQUISITION_NO ����ID
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:39:12 <BR>
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
	 * ����˵���� ������. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @param LISRESULT_ID Lis���ID
	 * @param LAB_REQUISITION_ID ���뵥��
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:40:05 <BR>
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
	 * ����˵���� ϸ����������Ϣ. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param startTime ��ѯ�����µ���ʼʱ��
	 * @param endTime ��ѯ�����µĽ���ʱ��
	 * @param LISRESULT_ID Lis���ID
	 * @param LAB_REQUISITION_ID ���뵥��
	 * @return
	 * @throws BusinessException
	 * @throws RemoteException
	 * @throws DocumentException
	 * @return: Document
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����11:41:09 <BR>
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
	 * ����˵���� ����һ���ĵ�ģ��. <BR>
	 * <p>��ʽΪ��
	 * 	<?xml version="1.0" encoding="UTF-8"?>
	 *	<ROOT><INPUT><SEARCH/></INPUT></ROOT>
	 * </p>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @return ��������ĵ�ģ���Ҷ�ӽ��SEARCH
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����10:18:56 <BR>
	 */
	public static Element createDocument(){
		Document document = DocumentHelper.createDocument();
		return document.addElement("ROOT").addElement("INPUT").addElement("SEARCH");
	}
	
	/**
	 * ����˵���� ����һ���ĵ��ڵ�. <BR>
	 * @see net.hp.healthcare.utils.WebServiceUtil <BR>
	 * @param name �ڵ�����
	 * @param text �ڵ�����
	 * @return
	 * @return: Element
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��10�� ����10:52:54 <BR>
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
