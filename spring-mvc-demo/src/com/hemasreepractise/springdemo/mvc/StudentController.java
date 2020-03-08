package com.hemasreepractise.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{favoritePlaces}") 
	private LinkedHashMap<String,String> favoritePlaceOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create a student object
		Student thesStudent=new Student();
		
		//add student object to the model
		theModel.addAttribute("student", thesStudent);
		
		theModel.addAttribute("favoritePlaces", favoritePlaceOptions);
		return "student-form";
	}
	
	
	@RequestMapping("/processStudentForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//log the input data
		System.out.println("theStudent: "+theStudent.getFirstName() +" " +theStudent.getLastName());
		return "student-confirmation";
	}

}
