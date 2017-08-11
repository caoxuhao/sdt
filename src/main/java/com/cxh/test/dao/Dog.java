package com.cxh.test.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("ddog")
@Component
public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("eat Bone");
	}
	
}
