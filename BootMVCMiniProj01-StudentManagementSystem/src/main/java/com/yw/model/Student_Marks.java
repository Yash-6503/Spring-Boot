package com.yw.model;

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
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student_Marks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer marks_id;
	
	@NonNull
	private Integer english;
	@NonNull
	private Integer marathi;
	@NonNull
	private Integer maths;
	@NonNull
	private Integer science;
	@NonNull
	private Integer socialScience;
	@NonNull
	private Integer totalMarks;
	@NonNull
	private Double percentage;
	@NonNull
	private String grade;
}
