package com.yw.service;

import java.util.ArrayList;
import java.util.Iterator;

import com.yw.entities.Doctor;

public interface IDoctorService
{
	public String registerDoctor(Doctor doctor);
	public Iterator<Doctor> showDoctors();
	public ArrayList<Doctor> showDoctorById();
	public String updateDoctor(Doctor doctor);
	public String updateDoctorFee(Integer id, Double salary);
	public String deleteDoctor(Integer id);
	public Long getDoctorCount();
}
