package com.yw.dao;

import java.util.ArrayList;

import com.yw.sbeans.EmployeeBean;

public interface IEmployee 
{
	public ArrayList<EmployeeBean> getEmployeesByDesig(String desig1, String desig2, String desig3) throws Exception;
}
