/*
  * BootDataJPAProject04 -    Update and Read Operations using MySQL-DB
*/

package com.yw;

import java.util.Iterator;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.yw.entities.Employee;
import com.yw.menu.MenuOperations;
import com.yw.service.IEmployeeServiceImpl;

@SpringBootApplication
public class BootDataJpaProj04UpdateAndReadOprMySqldbApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootDataJpaProj04UpdateAndReadOprMySqldbApplication.class, args);
		
		IEmployeeServiceImpl service = ctx.getBean("empService", IEmployeeServiceImpl.class);
		
		try(Scanner sc = new Scanner(System.in))
			{
				int choice;
				Employee emp = new Employee();
				do {
					System.out.println("\nEmployee Table Operations..");
					System.out.println("1. Update Employee");
					System.out.println("2. Update Employee Salary");
					System.out.println("3. Show All Employees");
					System.out.println("4. Exit");
					System.out.println("Enter your choice: ");
					choice = sc.nextInt();
					switch(choice) {
						case 1:
							String msg = MenuOperations.UpdateEmployeeOpr(service);
							System.out.println(msg);
							break;
							
						case 2:
							String message = MenuOperations.UpdateEmployeeSalary(service);
							System.out.println(message);
							break;
							
						case 3:
							MenuOperations.ShowAllEmployees(service);
							break;
							
						case 4:
							System.out.println("Exiting......");
							System.exit(0);
							
						default:
								System.out.println("Invalid Choice...");
					}
				}while(choice != 4);
			
			
			
//			System.out.println(msg);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();

	}

}
