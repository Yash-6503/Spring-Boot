package com.yw.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NonNull;

@Entity
@Table(name="Actor_Info")
public class Actor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer actorId;
	@NonNull
	private String actorName;
	@NonNull
	private String actorRole;
	@NonNull
	private Double actorFee;
}
