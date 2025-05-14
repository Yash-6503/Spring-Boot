package com.yw.service;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.entities.Employee;
import com.yw.repository.IEmoloyeeRepository;

@Service("empService")
public class IEmployeeServiceImpl implements IEmployeeService 
{

	@Autowired
    private  IEmoloyeeRepository empRepo;
	
	@Override
	public String updateEmployee(Employee emp) {
		if(emp != null) {
			empRepo.save(emp);
			return "Employee "+emp.getEmpId()+" updated Successfully...";
		}else {
			return "Employee not found..";
		}
	}

	@Override
	public Iterator<Employee> showEmployees() {
		Iterator<Employee> itr = empRepo.findAll().iterator();
		return itr;
	}

}
