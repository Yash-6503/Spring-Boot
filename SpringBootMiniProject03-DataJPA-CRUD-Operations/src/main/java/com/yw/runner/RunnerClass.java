package com.yw.runner;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;

import com.yw.menuopr.MenuOperations;
import com.yw.service.IDoctorServiceImpl;

public class RunnerClass {
	
	public static IDoctorServiceImpl service;
	
	public static void startApp(ApplicationContext ctx) {
		try(
				Scanner sc = new Scanner(System.in); 
			) {
			int choice;
			service = ctx.getBean("doctorService",IDoctorServiceImpl.class);
			do {
				System.out.println("\nCRUD Operations on Doctor Table");
				System.out.println("1. Register Doctor");
				System.out.println("2. Show All Doctors");
				System.out.println("3. Update Doctor");
				System.out.println("4. Update Doctor by Fee");
				System.out.println("5. Delete Doctor");
				System.out.println("6. Total Doctors Count");
				System.out.println("7. Exit");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				switch(choice) {
					case 1:
						MenuOperations.RegisterDoctor(service);
						break;
						
					case 2:
						MenuOperations.ShowAllDoctors(service);
						break;
						
					case 3:
						MenuOperations.UpdateDoctor(service);
						break;
						
					case 4:
						MenuOperations.UpdateDoctorFee(service);
						break;
						
					case 5:
						MenuOperations.DeleteDoctor(service);
						break;
						
					case 6:
						MenuOperations.GetDoctorsCount(service);
						break;
						
					case 7:
						System.out.println("Exiting...");
						System.exit(0);
						
					default:
						System.out.println("Invalid Choice...");
				}
			}while(choice != 7);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
