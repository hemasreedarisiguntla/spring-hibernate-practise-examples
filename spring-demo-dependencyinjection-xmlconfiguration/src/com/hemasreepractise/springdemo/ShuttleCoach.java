package com.hemasreepractise.springdemo;

public class ShuttleCoach implements Coach {
	
	//declare a private dependency
	private FortuneService fortuneService;
	
	//declare a public constructory
	public ShuttleCoach(FortuneService theFortuneService)
	{
		this.fortuneService=theFortuneService;
	}

	public ShuttleCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "jump 100 times daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
