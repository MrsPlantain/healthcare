package healthcare;

import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.*;
import org.junit.Test;

import com.kompakar.ehealth.base.exception.BusinessException;

import net.hp.healthcare.utils.WebServiceUtil;

public class WebServiceTest {

	@Test
	public void test() {
		try {
			Document document = WebServiceUtil.WS_HP_DEPARTMENT("2015-01-01 00:00:00", "2016-03-10 23:59:59");
			//Document document = WebServiceUtil.WS_HP_BILL_DETAIL(null, null, "5324930");
			
			List<Node> list = document.selectNodes("//OUTPUT/ITEMS/ITEM");
			for (Node node :
					list) {
				System.out.println(node.asXML());
				Document document1 = DocumentHelper.parseText(node.asXML());
				Element element = document1.getRootElement();
				Iterator<Element> it = element.elementIterator();
				while (it.hasNext()){
					System.out.println(it.next());
				}
			}
			//System.out.println(list);
		//	System.out.println(document);
			Element root = document.getRootElement();
			//System.out.println(root);
			Element output = root.element("OUTPUT");
			//System.out.println(output);
			Iterator<Element> it = output.elementIterator();
			while(it.hasNext()){
				Element node = it.next();
			//	System.out.println(node.asXML());
			}
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
