package com.yw.model;

import lombok.Data;

@Data
public class Employee 
{
	private Integer eno;
	private String ename;
	private String job;
//	private String desig;
	private Double salary;
	private Integer deptno;
	private Double grossSalary;
	private Double netSalary;
	
}
