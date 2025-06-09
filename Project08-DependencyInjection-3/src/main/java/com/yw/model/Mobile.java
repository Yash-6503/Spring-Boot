package com.yw.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Mobile {
	
	// Local variables of Mobile class
	private Integer IMEI_Number;
	private  String modelName;
	private String mobileName;
	private LocalDate mfgDate;
	private String  ram;
	private String storage;
	private Double price;
	private Boolean is5g;
	
	// Injecting processor object automatically
	@Autowired
	private Processor processor;
	
	// Injecting camera object manually by providing component/bean name
	@Qualifier("camera")
	private Camera camera;
	
}
