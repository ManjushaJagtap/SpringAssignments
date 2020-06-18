package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	// 4. Field Injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public  TennisCoach() {
		System.out.println("Inside Default Constructor : TennisCoach");
	}
	
	
	/*// 3. On any method name
	@Autowired
	public void anyMehod(FortuneService theFortuneService) {
		System.out.println("Inside AnyMethod Method : TennisCoach");
		fortuneService=theFortuneService;
	}
	*/
	
	/*// 2. define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("Inside Setter Method : TennisCoach");
		fortuneService=theFortuneService;
	}
	*/
	/* 1. Use of Constructor injection
	@Autowired
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService= thefortuneService;
	}
	*/
	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
