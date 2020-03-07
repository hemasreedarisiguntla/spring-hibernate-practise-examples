package com.hemasreepractise.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
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
