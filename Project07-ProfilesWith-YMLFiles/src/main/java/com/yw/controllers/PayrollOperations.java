package com.yw.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yw.models.Employee;
import com.yw.service.EmployeeServiceImpl;

@Controller("payroll")
public class PayrollOperations 
{
	
	@Autowired
	private EmployeeServiceImpl service;
	
	ArrayList<Employee> list = null;
	
	public ArrayList<Employee> displayEmployees(String desig1, String desig2, String desig3) throws Exception{
		
		list = service.filterEmployeesByDesig(desig1, desig2, desig3);
		
		return list;
	}
}
