package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.dao.Student;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext app =
				new AnnotationConfigApplicationContext(SpringContainer.class);
		Student student = app.getBean("student", Student.class);
		student.myData();

	}

}
