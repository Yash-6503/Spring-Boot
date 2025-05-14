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
import com.yw.service.IEmployeeServiceImpl;

@SpringBootApplication
public class BootDataJpaProj04UpdateAndReadOprMySqldbApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootDataJpaProj04UpdateAndReadOprMySqldbApplication.class, args);
		
		IEmployeeServiceImpl service = ctx.getBean("empService", IEmployeeServiceImpl.class);
		
		try(Scanner sc = new Scanner(System.in))
			{
			Employee emp = new Employee();
			System.out.println("Enter new employee name : ");
			emp.setEmpName(sc.nextLine());
			System.out.println("Enter new employee desig : ");
			emp.setEmpDesig(sc.nextLine());
			System.out.println("Enter new employee salary: ");
			emp.setEmpSalary(sc.nextDouble());
			System.out.println("Enter Employee Id to update : ");
			emp.setEmpId(sc.nextInt());
			String msg = service.updateEmployee(emp);
			System.out.println(msg);
			
			System.out.println("\nAfter Updating Employee...");
			Iterator<Employee> itr = service.showEmployees();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();

	}

}
