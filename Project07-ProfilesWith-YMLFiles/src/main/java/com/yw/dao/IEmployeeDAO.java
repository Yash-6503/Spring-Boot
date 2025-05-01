package com.yw.dao;

import java.util.ArrayList;

import com.yw.models.Employee;

public interface IEmployeeDAO
{
	public ArrayList<Employee> getEmployeesByDesig(String desig1, String desig2, String desig3) throws Exception;
}
