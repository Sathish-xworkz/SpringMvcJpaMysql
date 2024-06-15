package com.sathish.controller;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
		return "redirect:/view";
	}
	@RequestMapping("/view")
	public ModelAndView viewAllData() {
		ModelAndView mv=new ModelAndView();
	 List<User> allUser=userServiceImpl.getAllUsers();
		mv.addObject("userObj", allUser);
		mv.setViewName("viewUsers");
		return mv;
	}
	@RequestMapping("/deleteUser")
	public ModelAndView deleteUser(@RequestParam int id,Model model) {
		System.out.println(id);
		ModelAndView mv=new ModelAndView();
		userServiceImpl.deleteUser(id);
		 List<User> allUser=userServiceImpl.getAllUsers();
		mv.addObject("userObj", allUser);
		mv.setViewName("viewUsers");
		return mv;
	}
	@RequestMapping("/editeUser")
	public String editUser(@RequestParam int id,Model model) {
		ModelAndView mv=new ModelAndView();
		User returnUser =  userServiceImpl.getUserById(id);
		model.addAttribute("editUser", returnUser);
		System.out.println(returnUser);
		return "EditUser";
	}
	@RequestMapping("/update")
	public String update(@ModelAttribute ("user") User user,Model model) {
		userServiceImpl.updateUser(user);
		return "redirect:/view";
	}
}
