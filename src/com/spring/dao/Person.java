package com.spring.dao;

import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {
	
	public void getName() {
		System.out.println("person name is mosta..");
	}
}
