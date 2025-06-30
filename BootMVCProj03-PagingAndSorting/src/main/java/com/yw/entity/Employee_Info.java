package com.yw.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee_Info {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer empId;
	@NonNull
	private String empName;
	@NonNull
	private String job;
	@NonNull
	private String email;
	@NonNull
	private Boolean isActive;
	
}
