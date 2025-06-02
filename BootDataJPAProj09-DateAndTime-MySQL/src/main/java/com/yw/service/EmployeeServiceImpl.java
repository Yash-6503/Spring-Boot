package com.yw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.entities.Employee_Date_Time;
import com.yw.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public String saveEmployee(Employee_Date_Time empDateTime) {
		return "Employee with Id : "+empRepo.save(empDateTime).getId()+" saved successfully...";
	}

	@Override
	public List<Employee_Date_Time> showAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public List<Integer> showAgesByDesig(String desig) {
		return empRepo.getEmployeeAgesByDesig(desig);
	}

	
}
