package com.yw.calculations;

import com.yw.model.Student_Info;
import com.yw.model.Student_Marks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class GradeFinder {
	
	public Student_Info evaluateMarks(Student_Info stud) {
	    if (stud != null && stud.getMarks() != null) {
	        Student_Marks m = stud.getMarks();
	        
	        // Check individual subject pass condition (>= 35)
	        boolean allPassed = m.getEnglish() >= 35 &&
	                            m.getMarathi() >= 35 &&
	                            m.getMaths() >= 35 &&
	                            m.getScience() >= 35 &&
	                            m.getSocialScience() >= 35;

	        int total = m.getEnglish() + m.getMarathi() + m.getMaths() + m.getScience() + m.getSocialScience();
	        double percent = total / 5.0;

	        m.setTotalMarks(total);
	        m.setPercentage(percent);

	        if (!allPassed) {
	            m.setGrade("Fail");
	        } else {
	            if (percent > 95) {
	                m.setGrade("A+");
	            } else if (percent > 90) {
	                m.setGrade("A");
	            } else if (percent > 80) {
	                m.setGrade("B+");
	            } else if (percent > 70) {
	                m.setGrade("B");
	            } else if (percent > 60) {
	                m.setGrade("C+");
	            } else if (percent > 50) {
	                m.setGrade("C");
	            } else if (percent > 40) {
	                m.setGrade("Pass");
	            } else {
	                m.setGrade("Fail");
	            }
	        }
	    }
	    
	    return stud;
	}

}
