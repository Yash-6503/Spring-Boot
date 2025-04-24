package com.yw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.yw.sbeans.PersonDetails;

@SpringBootApplication
public class Project05BulkInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Project05BulkInjectionApplication.class, args);
		
		PersonDetails details = ctx.getBean("pDetails",PersonDetails.class);
		
		System.out.println(details);
	}

}
