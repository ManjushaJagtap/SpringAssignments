package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Badminton";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
