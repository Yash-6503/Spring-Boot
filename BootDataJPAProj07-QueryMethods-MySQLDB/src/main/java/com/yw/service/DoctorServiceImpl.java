package com.yw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yw.entities.Doctor;
import com.yw.repository.DoctorRepository;

@Service("doctorService")
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private DoctorRepository doctorRepo;
	
	@Override
	public List<Doctor> getAllDoctors() {
		return doctorRepo.showAllDoctors();
	}

	@Override
	public List<Doctor> getDoctorsByFeeRange(double min, double max) {
		return doctorRepo.showDoctorsByFeeRange(min, max);
	}

	@Override
	public List<Doctor> getDoctorsByNameStarting(String startingChars) {
		return doctorRepo.showDoctorsByNameFirstChars(startingChars.toLowerCase().concat("%"));
	}

	@Override
	public String updateDoctorFee(Double fee, Integer docId) {
		if(doctorRepo.existsById(docId)) {
			doctorRepo.updateDoctorFeeById(fee, docId);
			System.out.println("\nUpdating Doctors fee.....");
			return "Doctor with Id: "+docId+" is updated successfully.....";
		}else {
			return "Doctor not found...";
		}
	}

	@Override
	public String deleteDoctorTakingLessFee(Double fee) {
		Long count = doctorRepo.count();
		doctorRepo.deleteDoctorHavingLessFee(fee);
		if(count - doctorRepo.count() == 0) {
			return "No Doctors not deleted....";
		}
		return "Total "+(count - doctorRepo.count())+" Doctors deleted successfully...";
	}
	
	

}
