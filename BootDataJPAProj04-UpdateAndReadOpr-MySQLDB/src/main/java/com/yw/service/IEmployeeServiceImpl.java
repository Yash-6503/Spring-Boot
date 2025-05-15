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

	@Override
	public String updateEmployeeSalary(int id, Double salary) {
		Optional<Employee> opt = empRepo.findById(id);
		if(opt.isPresent()) {
			Employee emp = opt.get();
			emp.setEmpSalary(salary);
			empRepo.save(emp);
			return "Employee with Id "+id+" is updated with new Salary...";
		}else {
			return "Employee not Found....";
		}
	}

}
