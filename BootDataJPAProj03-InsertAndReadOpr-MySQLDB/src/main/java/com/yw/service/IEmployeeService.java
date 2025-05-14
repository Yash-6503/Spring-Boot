package com.yw.service;

import java.util.Iterator;

import com.yw.entites.Employee;

public interface IEmployeeService 
{
	public String registerEmployee(Employee emp);
	public Iterator<Employee> showEmployees();
}
