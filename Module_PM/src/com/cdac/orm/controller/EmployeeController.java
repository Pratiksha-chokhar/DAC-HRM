package com.cdac.orm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.orm.service.IEmployeeService;

@Controller
public class EmployeeController {
	
	
	
	@Autowired
	private IEmployeeService empService;
	@RequestMapping("/")
	public String showIndexPage(Model model) {
		model.addAttribute("title", 
				"Welcome to My Spring Hibernate MVC Application");
		return new String("index");//viewName
	}
	
	
	

	
	
}
