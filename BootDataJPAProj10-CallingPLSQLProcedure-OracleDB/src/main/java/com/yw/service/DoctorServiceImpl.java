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
	public List<Doctor> showDoctorsByIncomeRange(double start, double end) {
		//create StoredProcedureQuery object pointing to PLSQL query.
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_DOCTORS_BY_INCOME_RANGE", Doctor.class);
		//register IN,Out parameters
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, void.class, ParameterMode.REF_CURSOR);
		//set values to IN params
		query.setParameter(1, start);
		query.setParameter(2, end);
		
		//call PLSQL query
		List<Doctor> list = query.getResultList();
		
		return list;
	}

}
