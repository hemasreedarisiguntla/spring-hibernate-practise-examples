package com.hemasreepractise.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component("randomFortuneService")
public class RandomFortuneService implements FortuneService {
	
	private String[] fortuneArray;
	
	@PostConstruct
	public void setupMyData()
	{
		fortuneArray=new String[3];
		fortuneArray[0]="good fortune";
		fortuneArray[1]="unlucky fortune";
		fortuneArray[2]="try your luck";
	}

	@Override
	public String getFortune() {
		int randomNumber = (int) ((Math.random())*(fortuneArray.length));
		return fortuneArray[randomNumber];
	}

}
