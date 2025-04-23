package com.yw.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngg")
public class PetrolEngine implements Engine 
{
	@Override
	public void start() {
		System.out.println("Petrol Engine Started");
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine Stopped");		
	}

}
