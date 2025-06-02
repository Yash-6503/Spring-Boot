package com.yw.service;

import java.util.List;

import com.yw.entities.Employee_Date_Time;

public interface IEmployeeService {
	public String saveEmployee(Employee_Date_Time empDateTime);
	public List<Employee_Date_Time> showAllEmployees();
	public List<Integer> showAgesByDesig(String desig);
	public List<String> showEmpAgeById(Integer id);
}
