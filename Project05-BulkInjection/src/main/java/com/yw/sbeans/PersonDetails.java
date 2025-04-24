package com.yw.sbeans;

import java.util.List;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("pDetails")
@Setter
@ToString
@ConfigurationProperties(prefix="per.info")
public class PersonDetails 
{
	private String name;
	private String addr;
	private String email;
	private long mobile;
	
	private String[] favcolor;
	private List<String> favcity;
	private Set<String> hobby;
}
