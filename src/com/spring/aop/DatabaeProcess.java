package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DatabaeProcess {

	@Before("execution(public void getName())")
	public void start() {
		System.out.println("start");
	}
	
	@After("execution(public void getName())")
	public void end() {
		System.out.println("End");
	}
	
	@AfterReturning("execution(public void getName())")
	public void endReturn() {
		System.out.println("End return");
	}
}
