/*
BootDataJPAProject01 -  Crud Repository Application using OracleDB
*/

package com.yw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.yw.entity.Doctor;
import com.yw.service.DoctorServiceImpl;
import com.yw.service.IDoctorService;

@SpringBootApplication
public class Project08DataJpaApplication {

    private final DoctorServiceImpl doctorService;

    Project08DataJpaApplication(DoctorServiceImpl doctorService) {
        this.doctorService = doctorService;
    }

	public static void main(String[] args) 
	{
		ApplicationContext ctx = SpringApplication.run(Project08DataJpaApplication.class, args);
		
		IDoctorService service = ctx.getBean("doctorService",DoctorServiceImpl.class);
		
		try {
			Doctor doctor = new Doctor();
			doctor.setDocName("Rajesh Khanna");
			doctor.setSpecialization("Heart Surgen");
			doctor.setIncome(500000.772);
			String resultMessage = service.registerDoctor(doctor);
			System.out.println(resultMessage);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
