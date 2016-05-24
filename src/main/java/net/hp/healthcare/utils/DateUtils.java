package net.hp.healthcare.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * ����������  ����ʱ�乤����.  <BR>
 * ������: chaolijuan  <BR>
 * ʱ�䣺2016��3��7�� ����5:09:30  <BR>
 * ������   <BR>
 */
public class DateUtils {
	
	private static Logger logger = LogManager.getLogger(DateUtils.class);
	
	public static boolean isDate(String param){
		return param != null && param.matches(Contains.regex);
	}
	
	public static Date castStringToDate(String date){
		return DateUtils.castStringToDate(date,"yyyy-MM-dd HH:mm:ss");
	}
	
	/**
	 * ����˵���� . <BR>
	 * @see net.hp.healthcare.utils.DateUtils <BR>
	 * @param date
	 * @param format
	 * @return null if <b>date</b> couldn't be cast to a Date
	 * @Author: chaolijuan <BR>
	 * @Datetime��2016��3��18�� ����11:20:24 <BR>
	 */
	public static Date castStringToDate(String date,String format){
		if (date != null && format != null && date.length() >= format.length()){
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			try {
				return sdf.parse(date.substring(0, format.length()));
			} catch (ParseException e) {
				logger.error(e.getMessage());
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public static String castDateToString(Date date){
		return DateUtils.castDateToString(date,"yyyy-MM-dd HH:mm:ss");
	}

	public static String castDateToString(Date date, String string) {
		SimpleDateFormat sdf = new SimpleDateFormat(string);
		return sdf.format(date);
	}

	public static String currentTime(){
		return DateUtils.currentTime("yyyy-MM-dd HH:mm:ss");
	}

	public static String currentTime(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date());
	}

	
	@Test
	public void test(){
		System.out.println(DateUtils.currentTime().matches("^[0-9]{4}-[0-9]{0,1}[1-9]{1}-[0-9]{0,1}[1-9]{1} [0-9]{2}:[0-9]{2}:[0-9]{2}$"));
	}
}
