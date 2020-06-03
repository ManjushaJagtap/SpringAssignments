package com.springdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = new String[3];
		fortunes[0] = "aa";
		fortunes[1] = "bb";
		fortunes[2] = "cc";
		List<String> stringList = Arrays.asList(fortunes);
		Collections.shuffle(stringList);
		stringList.toArray();
		
		return fortunes[0];
	}

}