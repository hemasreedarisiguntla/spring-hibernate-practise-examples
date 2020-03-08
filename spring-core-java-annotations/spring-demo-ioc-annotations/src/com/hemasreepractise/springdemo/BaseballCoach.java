package com.hemasreepractise.springdemo;

import org.springframework.stereotype.Component;

@Component("myBaseballCoach")
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "spend 30 min in batting practise";
	}

}
