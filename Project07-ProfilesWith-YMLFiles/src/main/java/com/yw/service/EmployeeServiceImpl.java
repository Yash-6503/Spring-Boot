package com.yw.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.dao.IEmployeeDAO;
import com.yw.models.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService 
{
	
	@Autowired
	private IEmployeeDAO empDAO;
	
	ArrayList<Employee> list = null;

	@Override
	public ArrayList<Employee> filterEmployeesByDesig(String desig1, String desig2, String desig3) throws Exception 
	{
		String d1 = desig1.toUpperCase();
		String d2 = desig2.toUpperCase();
		String d3 = desig3.toUpperCase();
		
		list = empDAO.getEmployeesByDesig(d1, d2, d3);
		
		list.sort((l1,l2) -> l1.getEno().compareTo(l2.getEno()));
		
		list.forEach(emp -> {
			emp.setGrossSalary(emp.getSalary() + (emp.getSalary() * 0.5));
			emp.setNetSalary(emp.getSalary() - (emp.getSalary() * 0.2));
		});
		
		return list;
		
	}

}
