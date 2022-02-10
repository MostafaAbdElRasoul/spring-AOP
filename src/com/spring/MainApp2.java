package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.dao.Person;

public class MainApp2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext app =
				new AnnotationConfigApplicationContext(SpringContainer.class);
		
		Person p = app.getBean("myPerson", Person.class);
		p.getName();

	}

}
