package com.hemasreepractise.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class HockeyCoach implements Coach,DisposableBean {

	@Override
	public String getDailyWorkout() {
		return "practice hockey for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return "good to play hockey today";
	}
	
	public void doMyStartupStuff() {
		System.out.println("HockeyCoach:: Inside mystartup method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("HockeyCoach:: Inside destroy method");
	}

}
