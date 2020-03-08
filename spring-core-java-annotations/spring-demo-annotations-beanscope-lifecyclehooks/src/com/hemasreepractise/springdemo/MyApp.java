package com.hemasreepractise.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		// retrieve bean
		Coach baseBallCoach = context.getBean("myBaseballCoach", Coach.class);
		
		// retrieve bean
		Coach baseBallCoach1 = context.getBean("myBaseballCoach", Coach.class);
		
		System.out.println("pointing to same object "+ (baseBallCoach==baseBallCoach1));

		// retrieve bean
		Coach trackCoach = context.getBean("myTrackCoach", Coach.class);
		
		Coach trackCoach1 = context.getBean("myTrackCoach", Coach.class);
		
		System.out.println("pointing to same object "+ (trackCoach==trackCoach1));
		
		
		// retrieve bean
		Coach shuttleCoach = context.getBean("myShuttleCoach", Coach.class);
		
		context.close();

	}

}
