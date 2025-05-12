package com.yw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.entity.Doctor;
import com.yw.repository.IDoctorRepo;

@Service("doctorService")
public class DoctorServiceImpl implements IDoctorService
{

	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("Doctor Id(before save) :: "+doctor.getDocId());
		Doctor doc = doctorRepo.save(doctor);
		return "Doctor Object is saved with id value :	 "+doc.getDocId();
	}

}
