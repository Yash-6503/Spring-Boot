package com.yw.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="doctor")
@Data
public class Doctor 
{
	@Column(name="docId")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer docId;
	
	@Column(name="docName", length=25)
	private String docName;
	
	@Column(name="specialization", length=20)
	private String specialization;
	
	@Column(name="fee")
	private String fee;
}
