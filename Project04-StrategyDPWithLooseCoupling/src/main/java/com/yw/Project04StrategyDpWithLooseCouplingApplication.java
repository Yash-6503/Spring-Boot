package com.yw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.yw.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/yw/cfgs/applicationContext.xml")
public class Project04StrategyDpWithLooseCouplingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Project04StrategyDpWithLooseCouplingApplication.class, args);
		
		Vehicle v = ctx.getBean("vehicle",Vehicle.class);
		
		v.journey("Mumbai", "Hyderabad");
		
		
	}

}
