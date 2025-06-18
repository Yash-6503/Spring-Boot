package com.yw.runner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yw.BootDataJpaProj06FinderMethodsMySqldbApplication;
import com.yw.entities.Employee;
import com.yw.repository.EmployeeRepository;

@Component
public class Runner implements CommandLineRunner{

    private final BootDataJpaProj06FinderMethodsMySqldbApplication bootDataJpaProj06FinderMethodsMySqldbApplication;
	
	@Autowired
	private EmployeeRepository empRepo;

  
	@Override
	public void run(String... args) throws Exception {
		try(
				Scanner sc = new Scanner(System.in);
				){
			
			int choice;
			do {
				System.out.println("\nEmployee Table Operations");
				System.out.println("1. Show All Employees");
				System.out.println("2. Find Employee By Name");
				System.out.println("3. Find By Salary Between");
				System.out.println("4. Find By Job Role");
				System.out.println("5. Find By Name Starting chars");
				System.out.println("6. Find By Name Ending chars");
				System.out.println("7. Find By Name Containing chars");
				System.out.println("8. Find By Name using patten");
				System.out.println("9. Find Employees By Name in Sorting");
				System.out.println("10. Exit");
				System.out.println("Enter your choice: ");
				choice = Integer.parseInt(sc.nextLine());
				switch(choice) {
					case 1:
						Iterator<Employee> itr = empRepo.findAll().iterator();
						System.out.println("\nShowing All Employees......");
						itr.forEachRemaining(System.out::println);
						break;
						
					case 2:
						System.out.println("Enter Employee Name to Find: ");
						List<Employee> list2 = empRepo.findByeName(sc.nextLine());
						if(list2.isEmpty()) {
							System.out.println("No Employees found.....");
						}else {
							System.out.println("\nFinding and showing Employee....");
							list2.forEach(System.out::println);
						}
						break;
						
					case 3:
						System.out.println("Enter starting salary range: ");
						double start = Double.parseDouble(sc.nextLine());
						System.out.println("Enter ending salary range: ");
						double end =Double.parseDouble(sc.nextLine());
						List<Employee> list3 = empRepo.findBysalBetween(start, end);
						if(list3.isEmpty()) {
							System.out.println("No Employees found.....");
						}else {
							System.out.println("\nShowing Employee salary between "+start+" and "+end);
							list3.forEach(System.out::println);
						}
						break;
						
					case 4:
						System.out.println("Enter Employee Job Role: ");
						List<Employee> list4 = empRepo.findByjob(sc.nextLine());
						if(list4.isEmpty()) {
							System.out.println("No Employees found.....");
						}else {
							System.out.println("\nFinding Employee based on job role....");
							list4.forEach(System.out::println);
						}
						break;
						
					case 5:
						System.out.println("Enter name starting character: ");
						List<Employee> list5 = empRepo.findByeNameStartingWith(sc.nextLine());
						if(list5.isEmpty()) {
							System.out.println("No Employees found.....");
						}else {
							System.out.println("\nFinding Employees based on names starting chars....");
							list5.forEach(System.out::println);
						}
						break;
						
					case 6:
						System.out.println("Enter name ending character: ");
						List<Employee> list6 = empRepo.findByeNameEndingWith(sc.nextLine());
						if(list6.isEmpty()) {
							System.out.println("No Employees found.....");
						}else {
							System.out.println("\nFinding Employees based on names ending chars....");
							list6.forEach(System.out::println);
						}
						break;
						
					case 7:
						System.out.println("Enter name containing character: ");
						List<Employee> list7 = empRepo.findByeNameContainingIgnoreCase(sc.nextLine());
						if(list7.isEmpty()) {
							System.out.println("No Employees found.....");
						}else {
							System.out.println("\nFinding Employees based on names containing chars....");
							list7.forEach(System.out::println);
						}
						break;
						
					case 8:
						System.out.println("Enter name pattern %: ");
						List<Employee> list8 = empRepo.findByeNameLikeIgnoreCase(sc.nextLine());
						if(list8.isEmpty()) {
							System.out.println("No Employees found.....");
						}else {
							System.out.println("\nFinding Employees based on names pattern....");
							list8.forEach(System.out::println);
						}
						break;
						
					case 9:
						List<String> empList = new ArrayList<>();
						System.out.println("Enter how many Employees you want to find: ");
						Integer num = Integer.parseInt(sc.nextLine());
						for(int i=0; i<num; i++) {
							System.out.println("Enter Employee "+(i+1)+" name: ");
							empList.add(sc.nextLine());
						}
						List<Employee> list9 = empRepo.findByeNameIn(empList);
						if(list9.isEmpty()) {
							System.out.println("No Employees found.....");
						}else {
							System.out.println("\nFinding Employees based on names and sorting....");
							list9.stream().sorted((e1,e2) -> e1.getEName().compareTo(e2.getEName())).forEach(System.out::println);;
						}
						break;
						
					case 10:
						System.out.println("Exiting.....");
						System.exit(0);
						
					default:
						System.out.println("Invalid Choice...");
				}
			}while(choice != 10);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
