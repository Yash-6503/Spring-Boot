package com.yw.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="EMPLOYEE_INFO")
@Data
public class Employee 
{
	@Column(name="empId")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empDesig")
	private String empDesig;
	
	@Column(name="empSalary")
	private Double empSalary;
	
}
