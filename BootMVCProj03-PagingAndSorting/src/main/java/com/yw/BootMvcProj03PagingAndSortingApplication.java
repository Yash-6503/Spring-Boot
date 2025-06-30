package com.yw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootMvcProj03PagingAndSortingApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj03PagingAndSortingApplication.class, args);
	}

	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(BootMvcProj03PagingAndSortingApplication.class);
	    }
}
