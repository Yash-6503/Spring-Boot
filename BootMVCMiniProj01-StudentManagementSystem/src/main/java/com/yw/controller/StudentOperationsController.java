package com.yw.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yw.model.Student_Info;
import com.yw.service.StudentService;

@Controller
@RequestMapping("sms")
public class StudentOperationsController {
	
	@Autowired
	private StudentService studService;
	
	@GetMapping("/")
	public String getHome() {
		return "Home";
	}
	
	@GetMapping("/allStudents")
	public String getStudents(Map<String,List<Student_Info>> map) {
		map.put("students", studService.getAllStudents());
		return "DisplayStudents";
	}
	
	@GetMapping("/process")
	public String process(Map<String, Object> map) {
		map.put("attr1", "val1");
		map.put("sysDate", LocalDateTime.now());
		return "show_data";
	}
	
	@GetMapping("/view/{roll}")
	public String viewStudent(@PathVariable Integer roll, Model model) {
		Student_Info stud = studService.getStudentById(roll);
		model.addAttribute("student", stud);
		return "ViewStudent";
	}
	
	@GetMapping("/add")
	public String addStudentForm() {
		return "AddStudent";
	}
	
	@PostMapping("/save")
	public String addStudent(@ModelAttribute Student_Info stud, Model model) {
		String msg = studService.saveStudent(stud);
		model.addAttribute("message",msg);	
		return "DisplayStudents";
	}
	
	@GetMapping("/delete/{roll}")
	public String deleteStudent(@PathVariable Integer roll, Model model) {
		String msg = studService.removeStudent(roll);
		model.addAttribute("message",msg);
		return "Delete";
	}
	
	
}
