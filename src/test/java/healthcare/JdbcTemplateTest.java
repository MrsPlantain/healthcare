package healthcare;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCountCallbackHandler;

public class JdbcTemplateTest {

	private static ApplicationContext context = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml","applicationContext-quartz.xml");
	}

	@Test
	public void test() {
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "select * from VWINF_HP_DUTY";
		RowCountCallbackHandler rcch = new RowCountCallbackHandler();
		jdbcTemplate.query(sql, rcch);
		String coloumn [] =rcch.getColumnNames();
        for (int i = 0; i < coloumn.length; i++) {
            System.out.println(coloumn[i]);
        }
	}

}
