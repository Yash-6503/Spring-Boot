package com.yw.serviceImplementer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.yw.entity.Employee_Info;
import com.yw.repository.EmployeeRepository;
import com.yw.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Page<Employee_Info> getEmployeesInfoByPage(Pageable page) {
		return empRepo.findAll(page);
	}

}
