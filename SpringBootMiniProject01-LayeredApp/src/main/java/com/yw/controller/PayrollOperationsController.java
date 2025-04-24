package com.yw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yw.model.Employee;
import com.yw.service.EmployeeServiceImpl;

@Controller("payroll")
public class PayrollOperationsController
{
	@Autowired
	private EmployeeServiceImpl service;
	
	public List<Employee> showAllEmployeesByDesig(String desig1, String desig2, String desig3) throws Exception{
			List<Employee> list = service.fetchEmployeesByDesig(desig1, desig2, desig3);
			
			return list;
	}
}
