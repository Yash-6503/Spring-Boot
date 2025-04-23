package com.yw.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")						//make the class as spring bean
public class SeasonFinder 
{
	@Autowired
	private LocalDate ldt;
	
	public String findSeason()
	{
		//get current month
		int month = ldt.getMonthValue();
		
		//show seasons name
		if(month >= 3 && month <= 6){
			return "Summer Season";
		}else if(month >= 7 && month <= 10) {
			return "Rainy Season";
		}else {
			return "Winter Season";
		}
	}
}
