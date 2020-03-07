package com.hemasreepractise.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
		context.close();

	}

}
