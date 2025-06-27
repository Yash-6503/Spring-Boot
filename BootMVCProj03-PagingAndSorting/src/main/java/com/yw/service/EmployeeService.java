package com.yw.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.yw.entity.Employee_Info;

public interface EmployeeService {
	public Page<Employee_Info> getEmployeesInfoByPage(Pageable page);
}
