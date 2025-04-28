package com.yw.service;

import java.util.ArrayList;

import com.yw.sbeans.EmployeeBean;

public interface IEmployeeService 
{
	public ArrayList<EmployeeBean> showEmployeeByDesig(String desig1, String desig2, String desig3) throws Exception;
}
