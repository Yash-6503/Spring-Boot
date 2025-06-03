package com.yw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.entities.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service("docService")
public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	private EntityManager manager;
	
	@Override
	public List<Doctor> showDoctorsByFeeRange(double start, double end) {
		
		StoredProcedureQuery query = manager.createStoredProcedureQuery("get_doctors_by_fee_range", Doctor.class);
		
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		
		
		query.setParameter(1, start);
		query.setParameter(2, end);
		
		List<Doctor> list = query.getResultList();
		
		return list;
	}

}
