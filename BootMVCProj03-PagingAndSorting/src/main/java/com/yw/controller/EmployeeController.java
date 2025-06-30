package com.yw.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yw.entity.Employee_Info;
import com.yw.service.EmployeeService;

//@RestController
@Controller
@RequestMapping("pg")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/allEmployees")
	public String showAllEmployeesByPage(@PageableDefault(page=0,size=3, sort="job",direction=Sort.Direction.ASC) Pageable pageable, Map<String, Object> map) {
		Page<Employee_Info> page = empService.getEmployeesInfoByPage(pageable);
		map.put("empsData", page);
		return "Show_employees";
	}
	
	@GetMapping("/home")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/report")
	public String showReportByPage(
	    @RequestParam(value = "page", defaultValue = "0") int page,
	    @RequestParam(value = "size", defaultValue = "5") int size,
	    @RequestParam(value = "empId", required = false) Integer empId,
	    Map<String, Object> map) {

	    Pageable pageable = PageRequest.of(page, size, Sort.by("empId").ascending());

	    if (empId != null) {
	        Optional<Employee_Info> emp = empService.getEmployeeById(empId);
	        if (emp.isPresent()) {
	            List<Employee_Info> list = List.of(emp.get());
	            Page<Employee_Info> result = new PageImpl<>(list, pageable, list.size());
	            map.put("empsData", result);
	        } else {
	            map.put("empsData", Page.empty());
	            map.put("resultMsg", "Employee with ID " + empId + " not found.");
	        }
	    } else {
	        Page<Employee_Info> result = empService.getEmployeesInfoByPage(pageable);
	        map.put("empsData", result);
	    }

	    return "Show_employees";
	}

}
