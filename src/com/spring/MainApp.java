package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.dao.Post;
import com.spring.dao.PostService;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext app =
				new AnnotationConfigApplicationContext(SpringContainer.class);
		Post post = app.getBean("postImpl",Post.class);
		post.getPosts();
		System.out.println(post.getLikes());
		
		System.out.println("/////////////////////////");
		PostService postService = app.getBean("postServiceImpl",PostService.class);
		System.out.println(postService.getPosts());
		System.out.println(postService.getLikes());

	}

}
