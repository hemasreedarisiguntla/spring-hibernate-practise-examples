package com.hemasreepractise.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myShuttleCoach")
public class ShuttleCoach implements Coach {
	
	//field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${emailID}")
	private String email;
	
	@Value("${teamName}")
	private String team_name;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
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
