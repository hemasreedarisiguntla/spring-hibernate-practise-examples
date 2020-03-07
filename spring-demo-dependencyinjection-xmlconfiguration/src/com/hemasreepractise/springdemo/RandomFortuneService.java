package com.hemasreepractise.springdemo;

public class RandomFortuneService implements FortuneService {
	
	String[] fortuneArray = {"good fortune","unlucky fortune","try your luck"};

	@Override
	public String getFortune() {
		int randomNumber = (int) ((Math.random())*(fortuneArray.length));
		return fortuneArray[randomNumber];
	}

}
