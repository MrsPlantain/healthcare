package healthcare;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import net.hp.healthcare.job.DepartmentJob;

public class DepartmentJobTest {
	
	
	private static ApplicationContext context = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
		DepartmentJob job = (DepartmentJob) context.getBean("departmentJob");
		job.execute();
	}

}
