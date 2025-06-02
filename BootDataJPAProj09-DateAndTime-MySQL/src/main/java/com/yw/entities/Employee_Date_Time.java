package com.yw.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
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
//@Table(name="Employee_Date_Time")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee_Date_Time {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@NonNull
	@Column(length=30)
	private String name;
	
	@NonNull
	@Column(length=30)
	private String desig;
	
	@NonNull
	private LocalDateTime dob;
	
	@NonNull
	private LocalTime toj;
	
	@NonNull
	private LocalDate doj;
}
