package com.hemasreepractise.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		// retrieve bean
		Coach baseBallCoach = context.getBean("myBaseballCoach", Coach.class);

		System.out.println(baseBallCoach.getDailyWorkout());
		System.out.println(baseBallCoach.getDailyFortune());

		// retrieve bean
		Coach trackCoach = context.getBean("myTrackCoach", Coach.class);

		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());
		
		// retrieve bean
		ShuttleCoach shuttleCoach = context.getBean("myShuttleCoach", ShuttleCoach.class);

		System.out.println(shuttleCoach.getDailyWorkout());
		System.out.println(shuttleCoach.getDailyFortune());
		System.out.println(shuttleCoach.getEmail());
		System.out.println(shuttleCoach.getTeam_name());
		
		
		context.close();

	}

}
