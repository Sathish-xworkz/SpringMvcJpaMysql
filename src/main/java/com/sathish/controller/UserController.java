package com.sathish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sathish.entity.User;
import com.sathish.service.UserServiceImpl;

@Controller
public class UserController {
//HAS-A
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("/reg")
	public String home() {
		System.out.println("register..");
		return "registration";
	}
	
	@RequestMapping("/newRegister")
	public String newRegister(@ModelAttribute("user") User user) {
		System.out.println(user);
		// pass to service 
		userServiceImpl.accountCreate(user);
		return "Login";
	}
	
	
	
}
