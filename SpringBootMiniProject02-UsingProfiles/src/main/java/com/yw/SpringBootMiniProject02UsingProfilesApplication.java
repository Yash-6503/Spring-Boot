package com.yw;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.yw.controller.PayrollOprController;
import com.yw.sbeans.EmployeeBean;

@SpringBootApplication
public class SpringBootMiniProject02UsingProfilesApplication {

    private final PayrollOprController payroll;

    SpringBootMiniProject02UsingProfilesApplication(PayrollOprController payroll) {
        this.payroll = payroll;
    }

	public static void main(String[] args) throws IOException {
		ApplicationContext ctx = SpringApplication.run(SpringBootMiniProject02UsingProfilesApplication.class, args);
		
		PayrollOprController proll = ctx.getBean("payroll",PayrollOprController.class);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter desig1 : ");
		String desig1 = sc.nextLine();
		
		System.out.println("Enter desig2 : ");
		String desig2 = sc.nextLine();
		
		System.out.println("Enter desig3 : ");
		String desig3 = sc.nextLine();
		
		try {
			List<EmployeeBean> list = proll.getAllEmployees(desig1, desig2, desig3);
			System.out.println("Showing All Employees....");
			list.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Environment env = ctx.getEnvironment();
		System.out.println("Activate Profile: "+Arrays.toString(env.getActiveProfiles()));
		
		System.out.println("Main method ended...");
		
		((ConfigurableApplicationContext) ctx).close();		
	}

}
