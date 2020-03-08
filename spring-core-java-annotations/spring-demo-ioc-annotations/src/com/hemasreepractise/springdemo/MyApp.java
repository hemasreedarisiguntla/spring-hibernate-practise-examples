package com.hemasreepractise.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		// retrieve bean
		Coach baseBallCoach = context.getBean("myBaseballCoach", Coach.class);

		System.out.println(baseBallCoach.getDailyWorkout());

		context.close();

	}

}
