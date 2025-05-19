package com.yw.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.Repository.IDoctorRepository;
import com.yw.entities.Doctor;

@Service("doctorService")
public class IDoctorServiceImpl implements IDoctorService 
{

	@Autowired
	private IDoctorRepository doctorRepo;
	
	@Override
	public String registerDoctor(Doctor doctor) {
		if(doctor != null) {
			doctorRepo.save(doctor);
			return "Doctor with Id "+doctor.getDocId()+" saved successfully...";
		}
		return "Doctor not saved..";
	}

	@Override
	public Iterator<Doctor> showDoctors() {
		Iterator<Doctor> itr = doctorRepo.findAll().iterator();
		return itr;
	}

	@Override
	public ArrayList<Doctor> showDoctorById() {
		return null;
	}

	@Override
	public String updateDoctor(Doctor doctor) {
		if(doctor != null) {
			doctorRepo.save(doctor);
			return "Doctor with Id "+doctor.getDocId()+" is updated...";
		}
		return "Doctor is not Found..";
	}

	@Override
	public String updateDoctorFee(Integer id, Double salary) {
		Optional<Doctor> opt = doctorRepo.findById(id);
		Doctor doctor = new Doctor();
		doctor = opt.get();
		if(opt.isPresent()) {
			doctor.setFee(salary);
			return "Doctor with Id "+id+" is updated with salary...";
		}
		return "Doctor not found..";
	}

	@Override
	public String deleteDoctor(Integer id) {
		if(doctorRepo.existsById(id)) {
			doctorRepo.deleteById(id);
			return "Doctor with Id "+id+" is deleted successfully...";
		}
		return "Doctor not found...";
	}

	@Override
	public Long getDoctorCount() {
		Long count = doctorRepo.count();
		return count;
	}
	
	

}
