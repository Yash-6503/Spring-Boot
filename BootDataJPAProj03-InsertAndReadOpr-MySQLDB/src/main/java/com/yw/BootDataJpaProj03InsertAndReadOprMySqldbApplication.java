/*
 * BootDataJPAProject02 -    Insert and Read Operations using MySQL-DB
 */

package com.yw;

import java.util.Iterator;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.yw.entites.Employee;
import com.yw.service.EmployeeServiceImpl;

@SpringBootApplication
public class BootDataJpaProj03InsertAndReadOprMySqldbApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootDataJpaProj03InsertAndReadOprMySqldbApplication.class, args);
		
		EmployeeServiceImpl service = ctx.getBean("empService",EmployeeServiceImpl.class);
		
		try(Scanner sc = new Scanner(System.in)) {
			Employee emp = new Employee();
			System.out.println("Enter Employee Name: ");
			emp.setEmpName(sc.nextLine());
			System.out.println("Enter Employee Desig: ");
			emp.setEmpDesig(sc.nextLine());
			System.out.println("Enter Employee Salary: ");
			emp.setEmpSalary(sc.nextDouble());
			
			//Register Employee (insert operation)
			String msg = service.registerEmployee(emp);
			System.out.println(msg);
			
			//Show Employees (select/read operation)
			System.out.println("\nShowing All Employees of Employee_Info table...");
			Iterator<Employee> itr = service.showEmployees();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();	
	}

}
