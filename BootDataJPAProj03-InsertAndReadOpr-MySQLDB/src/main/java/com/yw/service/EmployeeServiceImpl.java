package com.yw.service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.entites.Employee;
import com.yw.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {


	@Autowired
	private IEmployeeRepo empRepo;
	
	@Override
	public String registerEmployee(Employee emp) {
		if(emp != null) {
			empRepo.save(emp);
			return "Employee with Id :  "+emp.getEmpId()+" saved successfully...";
		}else {
			return "Employee not saved";
		}
	}

	@Override
	public Iterator<Employee> showEmployees() {
		Iterator<Employee> itr = empRepo.findAll().iterator();
		return itr;
	}

}
