package com.yw.service;

import java.util.List;

import com.yw.model.Student_Info;

public interface StudentService {
	public List<Student_Info> getAllStudents();
	public Student_Info getStudentById(Integer roll);
	public String saveStudent(Student_Info stud);
	public String removeStudent(Integer roll);
	public String updateStudent(Student_Info stud);
}
