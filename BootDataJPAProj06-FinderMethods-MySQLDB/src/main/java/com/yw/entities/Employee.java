package com.yw.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="emp")
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
	@Id
	@SequenceGenerator(name="gen1", sequenceName = "empNo_Seq", initialValue = 1000, allocationSize = 1)
	@Column(name="empno")
	private Integer empNo;
	@Column(name="ename",length=20)
	private String eName;
	@Column(name="job",length=20)
	private String job;
	@Column(name="mgr")
	private Integer mgr;
	@Column(name="hiredate")
	private LocalDate hiredate;
	@Column(name="sal")
	private Float sal;
	@Column(name="comm")
	private Float comm;
	@Column(name="deptno")
	private Integer deptNo;
	
}
