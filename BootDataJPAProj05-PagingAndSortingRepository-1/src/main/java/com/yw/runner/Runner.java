package com.yw.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yw.service.IDoctorService;

@Component
public class Runner implements CommandLineRunner
{
	@Autowired
	private IDoctorService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.showDoctorsBySorting(true, "docName").forEach(System.out::println);
		System.out.println("--------------------------------------------------------");
		service.showDoctorsBySorting(false, "fee","docName").forEach(System.out::println);
	}

}
