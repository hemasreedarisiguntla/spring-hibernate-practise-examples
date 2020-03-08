package com.hemasreepractise.springdemo;

public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "practise bowling for 2 hours daily";
	}

	@Override
	public String getDailyFortune() {
		return "good one";
	}
	
	public void doMyStartupStuff() {
		System.out.println("CricketCoach:: Inside mystartup method");
	}
	
	public void doMyDestroyStuff() {
		System.out.println("CricketCoach:: Inside mydestroy method");
	}


}
