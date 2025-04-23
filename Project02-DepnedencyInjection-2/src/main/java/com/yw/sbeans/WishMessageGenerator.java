package com.yw.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator
{
	@Autowired
	public LocalTime time;
//	int time = lt.getHour(); 
	
	public String message() {
		if(time.getHour() > 6 && time.getHour() < 12) {
			return "Good Morning";
		}else if(time.getHour() > 12 && time.getHour() < 16) {
			return "Good Afternoon";
		}else if(time.getHour() > 16 && time.getHour() < 20) {
			return "Good Evening";
		}else {
			return "Good Night";
		}
	}
}
