package com.yw.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component("emp")
@Data
@Setter
@ConfigurationProperties(prefix="emp.info")
public class Employee 
{
	private String name;
	private String desig;
	private String addr;
	private String company;
	private String email;
	private Long phone;
	private Double salary;
}
