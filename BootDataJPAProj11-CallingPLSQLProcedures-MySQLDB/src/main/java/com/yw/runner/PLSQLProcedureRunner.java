package com.yw.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yw.entities.Doctor;
import com.yw.service.IDoctorService;

@Component
public class PLSQLProcedureRunner implements CommandLineRunner{

	@Autowired
	private IDoctorService docService;
	
	@Override
	public void run(String... args) throws Exception {
		
		List<Doctor> list1 = docService.showDoctorsByFeeRange(500.0,1500.0);
		System.out.println("\nShowing doctors whose fee range from 500 to 1500...");
		list1.forEach(System.out::println);
		
	}

}
