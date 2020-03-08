package com.hemasreepractise.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	//new controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model)
	{
		//read the request parameter from html form
		String theName=request.getParameter("studentName");
		
		//do some processing
		theName=theName.toUpperCase();
		
		//create a message
		String result= "Hey "+theName;
		
		//add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
		
	}
	
	//new controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDude(@RequestParam("studentName") String theName,Model model)
	{
		//do some processing
		theName=theName.toUpperCase();
		
		//create a message
		String result= "Hey V3 "+theName;
		
		//add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
		
	}
}
