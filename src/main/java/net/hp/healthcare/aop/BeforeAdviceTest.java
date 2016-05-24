package net.hp.healthcare.aop;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class BeforeAdviceTest {

	private static Logger logger = LogManager.getLogger(BeforeAdviceTest.class);
//	@Before("execution(* net.hp.healthcare.job.*.*(..))")
	public void authority(){
		logger.info("This is before method happen....");
	}

//	@Pointcut("execution(* execute(..))")
//	public void pointCutTest(){
//		logger.info("This is point cut method running....");
//	}
}
