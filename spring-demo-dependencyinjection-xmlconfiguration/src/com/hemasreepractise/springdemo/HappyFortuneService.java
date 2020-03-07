package com.hemasreepractise.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "you are lucky today";
	}

}
