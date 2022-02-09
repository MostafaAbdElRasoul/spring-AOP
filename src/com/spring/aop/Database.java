package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Database {
	
	//@Before("execution(void com.spring.dao.Post.getPosts())")
	//@Before("execution(public void com.spring.dao.Post.getPosts())")
	//@Before("execution(public void getPosts())")
	//@Before("execution(public * getPosts())")
	//@Before("execution(public * get*(com.spring.dao.Post))")
	//@Before("execution(public * get*())")
	//@Before("execution(public * get*(..))")
	@Before("execution(public * com.spring.dao.*.*(..))")
	public void connectionDb() {
		System.out.println("connected");
	}
}
