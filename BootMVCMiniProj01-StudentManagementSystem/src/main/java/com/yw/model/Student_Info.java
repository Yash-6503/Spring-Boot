package com.yw.model;

import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@RequestMapping
@AllArgsConstructor
public class Student_Info {
	
	 @Id
	 @SequenceGenerator(name = "gen1", sequenceName = "student_roll_seq", initialValue = 1, allocationSize = 1)
	 @GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer studRoll;
	
	 @NonNull
	private String name;
	
	 @NonNull
	private String email;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "marks_id") // foreign key column in Student_Info table
	private Student_Marks marks;
}
