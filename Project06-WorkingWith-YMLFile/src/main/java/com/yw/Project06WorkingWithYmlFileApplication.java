package com.yw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.yw.sbeans.Employee;

@SpringBootApplication
public class Project06WorkingWithYmlFileApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Project06WorkingWithYmlFileApplication.class, args);
		
		Employee empl = ctx.getBean("emp",Employee.class);
		
		System.out.println(empl);
	}

}
