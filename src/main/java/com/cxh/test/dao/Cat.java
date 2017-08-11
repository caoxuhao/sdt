package com.cxh.test.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("eat fish");
	}

}
