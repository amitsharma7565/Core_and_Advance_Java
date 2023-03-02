package com.bitlans.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bitLabs.Entity.Registration;

@Controller
public class HomeController {
	private Model model;

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Amit sharma");
		List<String> list = new ArrayList<String>();
		list.add("Amit");
		list.add("Vishal");
		list.add("Aarav");
		
		model.addAttribute("List",list);
		
		return "index";
	}
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("name", "Amit");
		mav.setViewName("welcome");
		return mav;
	}
	
	
//	public String addUser(@RequestParam("username") String name,
//			@RequestParam("email") String email,
//			@RequestParam("password") String password, Model model
//			) {
	@RequestMapping("/addUser")
	public String addUser(@ModelAttribute Registration rich, Model model) {
		

//	model.addAttribute("register", register);
//		model.addAttribute("name", name);
//		model.addAttribute("email", email);
//		model.addAttribute("password", password);
	System.out.println(rich.getUsername());
	System.out.println(rich.getEmail());
	System.out.println(rich.getPasswrod());
		return "welcome";
	}
}
