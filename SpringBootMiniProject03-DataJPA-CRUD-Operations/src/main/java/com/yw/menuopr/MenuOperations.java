package com.yw.menuopr;

import java.util.Iterator;
import java.util.Scanner;

import com.yw.entities.Doctor;
import com.yw.service.IDoctorServiceImpl;

public class MenuOperations {
	
	public static Scanner sc = new Scanner(System.in);
	public static Doctor doctor = new Doctor();
	
	public static void RegisterDoctor(IDoctorServiceImpl service) {
		System.out.println("Enter Doctor Name: ");
		doctor.setDocName(sc.nextLine());
		System.out.println("Enter Doctor Specialization: ");
		doctor.setSpecialization(sc.nextLine());
		System.out.println("Enter Doctor Fee: ");
		doctor.setFee(sc.nextDouble());
		String msg = service.registerDoctor(doctor);
		System.out.println(msg);
	}
	
	public static void ShowAllDoctors(IDoctorServiceImpl service) {
		System.out.println("Showing All Doctors...");
		Iterator<Doctor> itr = service.showDoctors();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
	}
	
	public static void UpdateDoctor(IDoctorServiceImpl service) {
		System.out.println("Enter id of Doctor to update : ");
		doctor.setDocId(sc.nextInt());
		System.out.println("Enter new Doctor Name: ");
		sc.nextLine();
		doctor.setDocName(sc.nextLine());
		System.out.println("Enter new Doctor Specialization: ");
		doctor.setSpecialization(sc.nextLine());
		System.out.println("Enter new Doctor Fee: ");
		doctor.setFee(sc.nextDouble());
		String msg = service.updateDoctor(doctor);
		System.out.println(msg);
	}
	
	public static void UpdateDoctorFee(IDoctorServiceImpl service) {
		System.out.println("Enter id of Doctor to update : ");
		Integer id = sc.nextInt();
		System.out.println("Enter new Doctor Fee : ");
		Double salary = sc.nextDouble();
		String msg = service.updateDoctorFee(id, salary);
		System.out.println(msg);
	}
	
	public static void DeleteDoctor(IDoctorServiceImpl service) {
		System.out.println("Enter id of Doctor to delete: ");
		Integer id = sc.nextInt();
		String msg = service.deleteDoctor(id);
		System.out.println(msg);
	}
	
	public static void GetDoctorsCount(IDoctorServiceImpl service) {
		System.out.println("Total number of Doctors are "+service.getDoctorCount());
	}
}
