package com.yw.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cc")
@Data
public class CourseContent 
{
	@Value("${course.cjava}")
	private double cjavaFee;
	
	@Value("${course.ajava}")
	private double ajavaFee;
	
	@Value("${course.sbms}")
	private double sbmsFee;
	
	@Value("${course.react}")
	private double reactFee;
	
	@Value("${course.aws}")
	private double awsFee;
	
	@Value("${course.testing}")
	private double testingFee;
	
	@Value("${course.dbms}")
	private double dbmsFee;
		

	@Override
	public String toString() {
		return "CourseContent [cjavaFee=" + cjavaFee + ", ajavaFee=" + ajavaFee + ", sbmsFee=" + sbmsFee + ", reactFee="
				+ reactFee + ", awsFee=" + awsFee + ", testingFee=" + testingFee + ", dbmsFee=" + dbmsFee
				+ "]";
	}

		
}
