package com.cxh.test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAction {
	
	@RequestMapping("/home2")
    public String home2() {
		
        return "<h1>这是html</h1></br><b>home</b>";
    }

}
