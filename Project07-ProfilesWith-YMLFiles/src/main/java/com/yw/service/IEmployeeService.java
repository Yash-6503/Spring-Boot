package com.yw.service;

import java.util.ArrayList;

import com.yw.models.Employee;

public interface IEmployeeService 
{
	public ArrayList<Employee> filterEmployeesByDesig(String desig1, String desig2, String desig3) throws Exception;
}
