package com.hemasreepractise.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		// Constructor injection
		Coach shuttleCoach = context.getBean("myShuttleCoach", Coach.class);

		System.out.println("Constructor Injection:: ShuttleCoach");
		System.out.println(shuttleCoach.getDailyWorkout());
		System.out.println(shuttleCoach.getDailyFortune());

		// Setter injection
		Coach baseBallCoach = context.getBean("myBaseballCoach", Coach.class);

		System.out.println("Setter Injection:: BaseballCoach");
		System.out.println(baseBallCoach.getDailyWorkout());
		System.out.println(baseBallCoach.getDailyFortune());

		/* Setter injection use class name
		 if there are any fields which are specific to class implmentation and not
		 declared in interface */
		BaseballCoach baseBallCoach1 = context.getBean("myBaseballCoach", BaseballCoach.class);

		System.out.println("Setter Injection:: BaseballCoach");
		System.out.println(baseBallCoach1.getDailyWorkout());
		System.out.println(baseBallCoach1.getDailyFortune());
		System.out.println(baseBallCoach1.getEmailAddress());
		System.out.println(baseBallCoach1.getTeam());
		
		
		// testing injected values from property file
		TrackCoach trackCoach = context.getBean("myTrackCoach", TrackCoach.class);

		System.out.println("Setter Injection:: TrackCoach :: inject values from property file");
		System.out.println(trackCoach.getDailyWorkout());
		// picking random fortune
		System.out.println(trackCoach.getDailyFortune());
		
		System.out.println(trackCoach.getTeamLocation());
		System.out.println(trackCoach.getCoachName());

		context.close();

	}

}
