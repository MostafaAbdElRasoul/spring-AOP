package com.spring.dao;


import org.springframework.stereotype.Component;


@Component
public class PostImpl implements Post {

	@Override
	public void getPosts() {
		System.out.println("All posts ....");
		
	}

	@Override
	public String getLikes() {
		return "Posts likees .....";
	}

}
