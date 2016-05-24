package net.hp.healthcare.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class PropertiesUtil {

	protected static final Logger logger = LogManager.getLogger(PropertiesUtil.class);
	private static Map<String, Properties> propertiesMap = new HashMap<String, Properties>(50);


	private PropertiesUtil() {

	}

	/**
	 * 方法说明：获取某个Properties文件的内容. <BR>
	 *
	 * @param fileName
	 * @return
	 * @return: Properties
	 * @Author: chaolijuan <BR>
	 * @Datetime：2016年3月15日 下午1:42:19 <BR>
	 * @see net.hp.healthcare.utils.PropertiesUtil <BR>
	 */
	public static Properties prop(String fileName) {
		Properties properties = new Properties();
		try {
			if (propertiesMap.get(fileName) == null) {
				logger.info("加载文件" + fileName);
				InputStream is = PropertiesUtil.class.getResourceAsStream("/" + fileName);
				properties.load(is);
				propertiesMap.put(fileName, properties);
				is.close();
			}else{
				return propertiesMap.get(fileName);
			}
		} catch (IOException e) {
			logger.error(e.getMessage());
			logger.error("FileName>>" + fileName);
		}
		return properties;
	}

	public static Properties propXML(String fileName) {
		Properties properties = new Properties();
		try {
			properties.loadFromXML(ClassLoader.getSystemResourceAsStream(fileName));
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		return properties;
	}

	public static void main(String[] args) {
		System.out.println(prop("conf/VWINF_HP_ABROGATE.jdbc"));
		System.out.println(propXML("conf/1.xml"));
	}

}
