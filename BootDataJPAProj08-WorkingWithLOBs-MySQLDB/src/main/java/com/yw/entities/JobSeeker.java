package com.yw.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@Table(name="Job_Seeker")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NonNull
	@Column(length=20)
	private String name;
	
	@NonNull
	@Column(length=20)
	private String jobRole;

	@NonNull
	@Lob
	private byte[] photo;
	
	@Lob
	@NonNull
	private char[] resume;
	
	@NonNull
	private boolean Indian;
	
	@NonNull
	private Long phone;
}
