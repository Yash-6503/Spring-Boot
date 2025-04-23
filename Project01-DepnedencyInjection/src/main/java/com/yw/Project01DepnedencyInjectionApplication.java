package com.yw;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.yw.sbeans.SeasonFinder;

@SpringBootApplication
public class Project01DepnedencyInjectionApplication {
	
	@Bean(name = "Id")
	public LocalDate currentDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		
		//get IOC container
		ApplicationContext ctx =  SpringApplication.run(Project01DepnedencyInjectionApplication.class, args);
		
		//to get target spring bean class obj
		SeasonFinder finder = ctx.getBean("sf",SeasonFinder.class);
		
		//invoke b.method
		String seasonName = finder.findSeason();
		
		System.out.println("Season Name: "+seasonName);
		
		//close IOC container
		( (ConfigurableApplicationContext) ctx).close();
	}

}
