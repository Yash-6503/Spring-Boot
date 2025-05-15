package com.yw.menu;

import java.util.Iterator;
import java.util.Scanner;

import com.yw.entities.Employee;
import com.yw.service.IEmployeeServiceImpl;

public class MenuOperations
{
	public static Employee emp = new Employee();
	public static Scanner sc = new Scanner(System.in);
	
	public static String UpdateEmployeeOpr(IEmployeeServiceImpl service) {
		System.out.println("Enter new employee name : ");
		emp.setEmpName(sc.nextLine());
		System.out.println("Enter new employee desig : ");
		emp.setEmpDesig(sc.nextLine());
		System.out.println("Enter new employee salary: ");
		emp.setEmpSalary(sc.nextDouble());
		System.out.println("Enter Employee Id to update : ");
		emp.setEmpId(sc.nextInt());
		String msg = service.updateEmployee(emp);
		return msg;
	}
	
	public static String UpdateEmployeeSalary(IEmployeeServiceImpl service) {
		System.out.println("Enter Employee Id to update: ");
		Integer id = sc.nextInt();
		System.out.println("Enter new Employee Salary: ");
		Double salary = sc.nextDouble();
		String msg = service.updateEmployeeSalary(id, salary);
		return msg;
	}
	
	public static void ShowAllEmployees(IEmployeeServiceImpl service) {
		System.out.println("\nShowing All Employees...");
		Iterator<Employee> itr = service.showEmployees();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
	}
}
