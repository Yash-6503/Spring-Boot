package com.yw.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.yw.entity.Employee_Info;

public interface EmployeeService {
	public Page<Employee_Info> getEmployeesInfoByPage(Pageable page);
    Optional<Employee_Info> getEmployeeById(Integer empId);
}
