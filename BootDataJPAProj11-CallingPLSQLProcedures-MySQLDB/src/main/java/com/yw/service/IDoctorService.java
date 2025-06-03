package com.yw.service;

import java.util.List;

import com.yw.entities.Doctor;

public interface IDoctorService {
	public List<Doctor> showDoctorsByFeeRange(double start, double end);
}
