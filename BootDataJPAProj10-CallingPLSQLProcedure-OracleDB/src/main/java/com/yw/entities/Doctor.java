package com.yw.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
//@Table(name="doctor")
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer docId;
	@NonNull
	@Column(length=30)
	private String docName;
	@NonNull
	private Double income;
	@NonNull
	@Column(length=30)
	private String specialization;
	
}
