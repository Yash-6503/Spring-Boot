package com.yw.service;

import java.util.List;

import com.yw.model.Employee;

public interface IEmployeeService
{
	public List<Employee> fetchEmployeesByDesig(String desig1, String desig2, String desig3) throws Exception;
}
