package com.cxh.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cxh.test.dao.Animal;

@Service
public class Zoo {
	
	@Autowired
	@Qualifier("ddog")
	private Animal animal;
	
	public Zoo() {
		System.out.println("Zoo构造函数");
	}
	
	public void eat() {
		System.out.println(animal);
		animal.eat();
	}
}
