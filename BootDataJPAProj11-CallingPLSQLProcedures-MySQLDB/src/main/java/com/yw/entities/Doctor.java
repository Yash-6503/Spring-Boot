package com.yw.entities;

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
	private Double fee;
	
	@NonNull
	@Column(length=30)
	private String specialization;
}
