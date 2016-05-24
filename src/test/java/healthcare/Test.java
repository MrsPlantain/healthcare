package healthcare;

import java.rmi.RemoteException;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.kompakar.ehealth.base.exception.BusinessException;
import com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServicePortType;
import com.kompakar.ehealth.server.webservice.integratedservices.wsservice.IMingDeAppInterfaceWsServicePortTypeProxy;

public class Test {
	
	private static IMingDeAppInterfaceWsServicePortType app;

	static{
		try{
			app = new IMingDeAppInterfaceWsServicePortTypeProxy();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
//			File file = new File("D:/study/xmltest/1.xml");
//			SAXReader reader = new SAXReader();
//			Document document = reader.read(file);
//			Element element = document.getRootElement();
//			Test.printNode(element);
//			
			Test.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void test() throws BusinessException, RemoteException{
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement("ROOT");
		Element input = root.addElement("INPUT");
		Element search = input.addElement("SEARCH");
		Element startTime = search.addElement("LAST_UPDATED_STARTDATE");
		Element endTime = search.addElement("LAST_UPDATED_ENDDATE");
		startTime.addText("2015-01-01 00:00:00");
		endTime.addText("2016-03-03 23:59:59");
		System.out.println(document.asXML());
		String xml = app.WS_HP_DEPARTMENT(document.asXML());
		System.out.println("=========================");
		System.out.println(xml);
		System.out.println("=========================");
	}
	
	public static void printNode(Element element){
		Iterator<Element> it = element.elementIterator();
		while(it.hasNext()){
			Element node = it.next();
			System.out.println(node.getName());
			Test.printNode(node);
		}
	}

}
