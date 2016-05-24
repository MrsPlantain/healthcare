package healthcare;

import net.hp.healthcare.job.DoctorJob;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.hp.healthcare.job.Job;

public class JobTest {
	
	private static ApplicationContext context = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml","applicationContext-quartz.xml");
	}

	@Test
	public void test() {
//		Job doctorJob = (Job) context.getBean("doctorJob");
//		doctorJob.execute();
//		Job abrojateJob = (Job) context.getBean("abrojateJob");
//		abrojateJob.execute();
//		Job departmentJob = (Job) context.getBean("departmentJob");
//		departmentJob.execute();
//		Job appointmentJob = (Job) context.getBean("appointmentJob");
//		appointmentJob.execute();
//		Job billDetailJob = (Job) context.getBean("billDetailJob");
//		billDetailJob.execute();
//		Job billJob = (Job)context.getBean("billJob");
//		billJob.execute();
//		Job codemstrJob = (Job) context.getBean("codemstrJob");
//		codemstrJob.execute();
//		Job dutyJob = (Job) context.getBean("dutyJob");
//		dutyJob.execute();
//		Job lisResultBacJob = (Job) context.getBean("lisResultBacJob");
//		lisResultBacJob.execute();
//		Job lisResultJob = (Job) context.getBean("lisResultJob");
//		lisResultJob.execute();
//		Job orderItemJob = (Job) context.getBean("orderItemJob");
//		orderItemJob.execute();
//		Job patientJob = (Job) context.getBean("patientJob");
//		patientJob.execute();
		Job visitJob = (Job) context.getBean("visitJob");
		visitJob.execute();
	}

}
