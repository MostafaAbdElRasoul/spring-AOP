package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Database {
	
	@Pointcut("execution(public * com.spring.dao.*.*(..))")
	public void myPointCut() {}
	
	@Pointcut("execution(public * com.spring.dao.*.getLi*())")
	public void myGetLi() {}
	
	//@Before("execution(void com.spring.dao.Post.getPosts())")
	//@Before("execution(public void com.spring.dao.Post.getPosts())")
	//@Before("execution(public void getPosts())")
	//@Before("execution(public * getPosts())")
	//@Before("execution(public * get*(com.spring.dao.Post))")
	//@Before("execution(public * get*())")
	//@Before("execution(public * get*(..))")
	@Before("myPointCut() && !myGetLi()")
	public void connectionDb() {
		System.out.println("connected");
	}
	@Before("myPointCut() && !myGetLi()")
	public void login() {
		System.out.println("login success ..");
	}
	
}
