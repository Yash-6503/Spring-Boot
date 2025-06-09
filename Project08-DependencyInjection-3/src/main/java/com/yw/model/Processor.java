package com.yw.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Processor {
	//Local variables of Processor class
	private long serialNumber;
	private String brandName;
	private String specialization;
}
