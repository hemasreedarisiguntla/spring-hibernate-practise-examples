package com.hemasreepractise.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myBaseballCoach")
public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach()
	{
		
	}
	//constructor injection
	@Autowired
	public BaseballCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 30 min in batting practise";
	}

	@Override
	public String getDailyFortune() {
		return "hey baseballplayer "+fortuneService.getFortune();
	}

}
