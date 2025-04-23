package com.yw.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle
{
	@Autowired
	@Qualifier("motor")
	private Engine engine;
	
	public void journey(String start, String end) {
		engine.start();
		System.out.println("Journey Started from "+start);
		System.out.println("Journey is going on............");
		System.out.println("Journey Ended at "+end);
		engine.stop();
		
	}
}
