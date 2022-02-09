package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class PostServiceImpl implements PostService {

	@Override
	public String getPosts() {
		return "Post Service";
		
	}

	@Override
	public String getLikes() {
		// TODO Auto-generated method stub
		return "Post Service likes ..";
	}

}
