package com.yw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.dao.EmployeeImplDAO;
import com.yw.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeImplDAO empDAO;
	
	@Override
	public List<Employee> fetchEmployeesByDesig(String desig1, String desig2, String desig3) throws Exception {
		
		desig1 = desig1.toUpperCase();
		desig2 = desig2.toUpperCase();
		desig3 = desig3.toUpperCase();
		
		List<Employee> list = empDAO.getEmployeesByDesig(desig1, desig2, desig3);
		
		list.sort((l1,l2) -> l1.getEno().compareTo(l2.getEno()));
		
		list.forEach(emp -> {
			emp.setGrossSalary(emp.getSalary() + (emp.getSalary() * 0.5));
			emp.setNetSalary(emp.getSalary() - (emp.getSalary() * 0.2));
		});
		
		return list;
	}

}
