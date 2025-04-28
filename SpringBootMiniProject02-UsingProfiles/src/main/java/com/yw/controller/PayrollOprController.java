package com.yw.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yw.sbeans.EmployeeBean;
import com.yw.service.EmployeeServiceImpl;

@Controller("payroll")
public class PayrollOprController 
{
	@Autowired
	private EmployeeServiceImpl service;
	
	public ArrayList<EmployeeBean> getAllEmployees(String desig1, String desig2, String desig3) throws Exception
	{
		ArrayList<EmployeeBean> list = service.showEmployeeByDesig(desig1, desig2, desig3);
		
		return list;
	}
}
