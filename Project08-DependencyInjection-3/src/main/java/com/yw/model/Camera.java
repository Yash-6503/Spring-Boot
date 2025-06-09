package com.yw.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("camera")
@Data
public class Camera {
	// Local variables of Camera class
	private String brandName;
	private String pixels;
	private String Specialization;
	private Boolean isNightMode;
}
