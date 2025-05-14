package com.yw.service;

import java.util.Iterator;

import com.yw.entities.Employee;

public interface IEmployeeService 
{
	public String updateEmployee(Employee emp);
	public Iterator<Employee> showEmployees();
}
