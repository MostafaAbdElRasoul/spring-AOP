package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Database {
	
	@Before("execution(public void getPosts())")
	public void connectionDb() {
		System.out.println("connected");
	}
}
