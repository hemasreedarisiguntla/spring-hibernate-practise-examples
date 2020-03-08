package com.hemasreepractise.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myTrackCoach")
@Scope("prototype")
public class TrackCoach implements Coach,DisposableBean {
	
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
	
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("trackcoach:: startup call");
	}
	
	@Override
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("trackcoach:: In my destroy method");
	}



}
