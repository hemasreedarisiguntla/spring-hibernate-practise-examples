package com.hemasreepractise.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	private String teamLocation;
	private String coachName;
	
	public TrackCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getTeamLocation() {
		return teamLocation;
	}

	public void setTeamLocation(String teamLocation) {
		this.teamLocation = teamLocation;
	}

}
