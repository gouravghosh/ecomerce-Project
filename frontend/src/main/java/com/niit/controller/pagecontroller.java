package com.niit.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pagecontroller {

	@RequestMapping("/login")
	public String showlogin()
	{
		return "Login";
	}
	
	@RequestMapping("/aboutUS")
	public String showAboutUS()
	{
		return "AboutUs";
	}
	
	@RequestMapping("/ContactUS")
	public String showContactUS()
	{
		return "ContactUs";
		
	}	
	
	@RequestMapping("/register")
	public String showregister()
	{
		return "Register";
		
	}
	
	@RequestMapping("/")
	public String showhomePage()
	{
		return "index";
	}
	
	
}
