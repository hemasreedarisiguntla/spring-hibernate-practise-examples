package com.hemasreepractise.springdemo;

import org.springframework.stereotype.Component;

@Component("happyFortuneService")
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "you are lucky today";
	}

}
