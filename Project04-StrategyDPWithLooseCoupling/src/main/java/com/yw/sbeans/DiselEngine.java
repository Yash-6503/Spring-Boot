package com.yw.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngg")
public class DiselEngine implements Engine 
{
	@Override
	public void start() {
		System.out.println("Diesel Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("Diesel Engine Stopped");		
	}

}
