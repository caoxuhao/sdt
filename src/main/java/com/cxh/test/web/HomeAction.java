package com.cxh.test.web;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cxh.test.domain.User;
import com.cxh.test.mapper.UserMapper;
import com.cxh.test.service.Zoo;

@Controller
public class HomeAction {
	
	@Autowired
    private UserMapper userMapper;
	
	@Autowired
	private Zoo zoo;
	
	@RequestMapping("/home1")
    public String home() {
		
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		zoo.eat();
		
		List<User> ul = userMapper.getAll();
		for (User user : ul) {
			System.out.println(user);
		}
        return "home";
    }
	
}

