package com.yw;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.yw.sbeans.WishMessageGenerator;

@SpringBootApplication
public class Project02DepnedencyInjection2Application {

	@Bean(name="time")
	public LocalTime currentTime(){
		return LocalTime.now();
	}
	
	public static void main(String[] args) {
		
		ApplicationContext ctx =  SpringApplication.run(Project02DepnedencyInjection2Application.class, args);
		
		WishMessageGenerator msg = ctx.getBean("wmg",WishMessageGenerator.class);
		
		String message = msg.message();
		
		System.out.println("Wish Message : "+message);
		
		( (ConfigurableApplicationContext) ctx).close();
	}

}
