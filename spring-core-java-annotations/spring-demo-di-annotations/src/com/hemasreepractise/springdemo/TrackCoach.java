package com.hemasreepractise.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myTrackCoach")
public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//setter injection
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k daily";
	}

	@Override
	public String getDailyFortune() {
		return "Track Coach:: "+fortuneService.getFortune();
	}



}
