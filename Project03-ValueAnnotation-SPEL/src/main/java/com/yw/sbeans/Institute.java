package com.yw.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("ins")
@Data
public class Institute 
{
	@Value("${ins.name}")
	private String insName;
	
	@Value("${ins.addr}")
	private String insAddr;
	
	@Value("${ins.email}")
	private String insEmail;
	
	@Value("${ins.phone}")
	private Long insPhone;
	
//	@Value("#{@cc.cjavaFee + @cc.ajavaFee}")
//	private double  totalFee;

	@Override
	public String toString() {
		return "Institute [insName=" + insName + ", insAddr=" + insAddr + ", insEmail=" + insEmail + ", insPhone="
				+ insPhone + "]";
	}
	
	
}
