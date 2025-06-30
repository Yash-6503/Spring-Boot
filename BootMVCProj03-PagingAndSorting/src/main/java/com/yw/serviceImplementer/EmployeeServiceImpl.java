package com.yw.serviceImplementer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yw.entity.Employee_Info;
import com.yw.repository.EmployeeRepository;
import com.yw.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Page<Employee_Info> getEmployeesInfoByPage(Pageable page) {
		return empRepo.findAll(page);
	}
	
	@Override
    public Optional<Employee_Info> getEmployeeById(Integer empId) {
        return empRepo.findById(empId);
    }

}
