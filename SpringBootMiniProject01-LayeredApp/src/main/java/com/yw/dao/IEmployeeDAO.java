package com.yw.dao;

import java.util.List;

import com.yw.model.Employee;

public interface IEmployeeDAO
{
	public List<Employee> getEmployeesByDesig(String desig1, String desig2, String desig3) throws Exception;
}
