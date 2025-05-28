package com.yw.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yw.entities.Doctor;
import com.yw.service.DoctorServiceImpl;

@Component
public class QueryMethodRunner implements CommandLineRunner
{
	@Autowired
	private DoctorServiceImpl doctorService;
	
	@Override
	public void run(String... args) throws Exception {
		
		//1. show all doctors
		List<Doctor> list1 = doctorService.getAllDoctors();
		System.out.println("\nShowing all Doctors.....");		
		list1.forEach(System.out::println);
		
		//2.show doctors having fee range between 500 to 1500
		List<Doctor> list2 = doctorService.getDoctorsByFeeRange(500,1500);
		System.out.println("\nShowing Doctors having fee range between 500 to 1500");
		list2.forEach(System.out::println);
		
		//3.show doctors by name's starting chars
		List<Doctor> list3 = doctorService.getDoctorsByNameStarting("r");
		System.out.println("\nShowing Doctors by name's starting chars....");
		list3.forEach(System.out::println);
		
		//4. showing doctors whose name length is greater than 12 chars
		String msg = doctorService.updateDoctorFee(400.00,152);
		System.out.println("\n"+msg);
		
		//5.deleteing doctors who takes less salary
		String msg1 = doctorService.deleteDoctorTakingLessFee(100.0);
		System.out.println("\n"+msg1);
	}

}
