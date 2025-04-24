package com.yw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.yw.controller.PayrollOperationsController;
import com.yw.model.Employee;

import java.util.*;

@SpringBootApplication
public class BootMiniProject01LayeredAppApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootMiniProject01LayeredAppApplication.class, args);
		PayrollOperationsController proll = ctx.getBean("payroll",PayrollOperationsController.class);
		try {
			List<Employee> list = proll.showAllEmployeesByDesig("CLERK", "MANAGER", "SALESMAN");
			list.forEach(emp -> {
				System.out.println(emp);
			});
		}catch(Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}
	
	
}
