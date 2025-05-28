package com.yw.service;

import java.util.List;

import com.yw.entities.Doctor;

public interface IDoctorService {
	public List<Doctor> getAllDoctors();
	public List<Doctor> getDoctorsByFeeRange(double min, double max);
	public List<Doctor> getDoctorsByNameStarting(String startingChars);
	public String updateDoctorFee(Double fee, Integer docId);
	public String deleteDoctorTakingLessFee(Double fee);	
}
