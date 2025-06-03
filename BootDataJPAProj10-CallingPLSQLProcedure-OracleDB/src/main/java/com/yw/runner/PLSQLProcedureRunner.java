package com.yw.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yw.entities.Doctor;
import com.yw.service.IDoctorService;

@Component
public class PLSQLProcedureRunner implements CommandLineRunner 
{
	@Autowired
	private IDoctorService doctorService;

	@Override
	public void run(String... args) throws Exception {
		
		List<Doctor> list1 = doctorService.showDoctorsByIncomeRange(500.0, 2000.0);
		System.out.println("\nShowing doctors by income range from 500 to 2000");
		list1.forEach(System.out::println);
		
	}

}
