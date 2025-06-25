package com.yw.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.calculations.GradeFinder;
import com.yw.model.Student_Info;
import com.yw.repository.StudentRepository;
import com.yw.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	public StudentRepository studRepo;
	
	GradeFinder gf = new GradeFinder();
	
	@Override
	public List<Student_Info> getAllStudents() {
		return studRepo.findAll();
	}

	@Override
	public Student_Info getStudentById(Integer roll) {
//		if(studRepo.existsById(id)) {
//			return studRepo.findById(id).get();
//		}
//		return null;
		
		return studRepo.findById(roll).orElse(null);
	}

	@Override
	public String saveStudent(Student_Info stud) {
	    if (stud != null) {
	        studRepo.save(gf.evaluateMarks(stud));
	        return "Student " + stud.getName() + " added Successfully...";
	    }
	    return "Student not added...";
	}

	@Override
	public String removeStudent(Integer roll) {
		if(studRepo.existsById(roll)) {
			studRepo.deleteById(roll);
			return "Student deleted successfully...";
		}
		return "Student not deleted....";
	}

	@Override
	public String updateStudent(Student_Info stud) {
		if(stud != null) {
			studRepo.save(gf.evaluateMarks(stud));
			return "Student " + stud.getName() + " updated Successfully...";
		}
		return "Student not updated...";
	}

}
