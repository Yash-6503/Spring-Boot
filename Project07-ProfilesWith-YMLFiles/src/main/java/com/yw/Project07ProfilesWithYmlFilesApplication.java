package com.yw;

import java.io.Closeable;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.yw.controllers.PayrollOperations;
import com.yw.models.Employee;

@SpringBootApplication
public class Project07ProfilesWithYmlFilesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Project07ProfilesWithYmlFilesApplication.class, args);
		
		PayrollOperations proll = ctx.getBean("payroll",PayrollOperations.class);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Designation 1: ");
		String desig1 = sc.nextLine();
		
		System.out.println("Enter Designation 2: ");
		String desig2 = sc.nextLine();
		
		System.out.println("Enter Designation 3: ");
		String desig3 = sc.nextLine();
		
		try(
				sc
				) {
			List<Employee> list = proll.displayEmployees(desig1, desig2, desig3);
			
			list.forEach(System.out::println);
			
			Environment env = ctx.getEnvironment();				
			System.out.println("Activate Profile: "+Arrays.toString(env.getActiveProfiles()));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
