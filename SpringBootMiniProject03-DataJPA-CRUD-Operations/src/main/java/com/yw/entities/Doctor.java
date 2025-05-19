package com.yw.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Doctor")
@Data
public class Doctor {
	
	@Column(name="docId")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer docId;
	
	@Column(name="docName")
	private String docName;
	
	@Column(name="specialization")
	private String specialization;
	
	@Column(name="fee")
	private Double fee;
}
