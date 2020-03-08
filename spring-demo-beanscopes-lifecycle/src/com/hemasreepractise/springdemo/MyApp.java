package com.hemasreepractise.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//singleton bean scope - same instance is returned for every call
		Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);
		System.out.println(cricketCoach);
		
		Coach cricketCoach1 = context.getBean("myCricketCoach", Coach.class);
		System.out.println(cricketCoach1);
		
		System.out.println("pointing to same object singleton::"+ (cricketCoach==cricketCoach1));
		
		//prototype bean scope - new instance is created for every call
		Coach hockeyCoach = context.getBean("myHockeyCoach", Coach.class);
		System.out.println(hockeyCoach);
		
		Coach hockeyCoach1 = context.getBean("myHockeyCoach", Coach.class);
		System.out.println(hockeyCoach1);
		
		System.out.println("pointing to same object prototype::"+ (hockeyCoach==hockeyCoach1));
		
		//destroy method will be called for prototype scope bean
		//we have to explicitly track prototype scoped beans and release expensive resources
		//we are doing it in custombeanprocessor
		context.close();

	}

}
