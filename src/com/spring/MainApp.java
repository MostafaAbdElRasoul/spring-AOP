package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.dao.Post;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext app =
				new AnnotationConfigApplicationContext(SpringContainer.class);
		Post post = app.getBean("postImpl",Post.class);
		post.getPosts();
		post.getPosts();

	}

}
