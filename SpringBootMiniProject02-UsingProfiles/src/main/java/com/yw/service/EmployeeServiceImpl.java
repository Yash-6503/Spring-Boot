package com.yw.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.dao.EmployeeDAOImpl;
import com.yw.dao.IEmployee;
import com.yw.dao.MySQLEmployeeDAO;
import com.yw.sbeans.EmployeeBean;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	ArrayList<EmployeeBean> list = null;
	
	@Autowired
	private IEmployee empDAO;

	
	@Override
	public ArrayList<EmployeeBean> showEmployeeByDesig(String desig1, String desig2, String desig3) throws Exception 
	{
		desig1 = desig1.toUpperCase();
		desig2 = desig2.toUpperCase();
		desig3 = desig3.toUpperCase();
		
		list = empDAO.getEmployeesByDesig(desig1, desig2, desig3);
		
		list.sort((e1,e2) -> e1.getEno().compareTo(e2.getEno()) );
		
		list.forEach(emp -> {
			emp.setGrossSalary(emp.getSalary() + (emp.getSalary() * 0.5));
			emp.setNetSalary(emp.getSalary() -  (emp.getSalary() * 0.2));
		});
		
		return list;
	}

}
