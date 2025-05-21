package com.yw.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;

import com.yw.entities.Doctor;
import com.yw.service.DoctorServiceImpl;

public class Runner implements CommandLineRunner 
{

	@Autowired
	private DoctorServiceImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		service.showDataThroughPagination(3);
		
		try {
			Page<Doctor> page = service.showDoctorsInfoByPageNo(2, 3, false, "docName");
			System.out.println("page number : "+page.getNumber());
			System.out.println("pages count : "+page.getTotalPages());
			System.out.println("Is first page : "+page.isFirst());
			System.out.println("Is last page : "+page.isLast());
			System.out.println("page size : "+page.getSize());
			System.out.println("page elements count : "+page.getNumberOfElements());
			if(!page.isEmpty()) {
				List<Doctor> list = page.getContent();
				list.forEach(System.out::println);
			}else {
				System.out.println("no page found");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
