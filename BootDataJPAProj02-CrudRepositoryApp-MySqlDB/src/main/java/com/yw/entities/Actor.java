package com.yw.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ACTOR_INFO")
@Data
public class Actor 
{
	
	@Column(name="actorId")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer actorId;
	
	@Column(name="actorName", length=25)
	private String actorName;
	
	@Column(name="actorRole", length=20)
	private String actorRole;
	
	@Column(name="actorFee")
	private Double actorFee;
	
}
