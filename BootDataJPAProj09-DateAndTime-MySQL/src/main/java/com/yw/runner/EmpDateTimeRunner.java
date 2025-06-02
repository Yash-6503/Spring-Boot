package com.yw.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yw.entities.Employee_Date_Time;
import com.yw.service.EmployeeServiceImpl;
import com.yw.service.IEmployeeService;

@Component
public class EmpDateTimeRunner implements CommandLineRunner
{

    private final EmployeeServiceImpl employeeServiceImpl;

	@Autowired
	private IEmployeeService empService;

    EmpDateTimeRunner(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }
	
	@Override
	public void run(String... args) throws Exception {
		
		
		//1. saving emp
		Employee_Date_Time empDateTime = new Employee_Date_Time("yash","developer",LocalDateTime.of(2003,5, 6, 19, 20),
																								LocalTime.of(10, 38),
																								LocalDate.of(2025, 07, 01));
		String msg1 = empService.saveEmployee(empDateTime);
		System.out.println("\n"+msg1);
		
		//2. showing all employees.
		List<Employee_Date_Time> list1 = empService.showAllEmployees();
		System.out.println("\nShowing all employees...");
		list1.forEach(System.out::println);
		
		//3. find emp age based on desig.
		List<Integer> list2 = empService.showAgesByDesig("clerk");
		System.out.println("\nShowing employee ages which desig = clerk");
		list2.forEach(System.out::println);
		
		//4. find emp age based on id
		List<String> list3 = empService.showEmpAgeById(1);
		System.out.println("\nShowing employee age whose id is 1");
		list3.forEach(System.out::println);
		
	}

}
