package com.yw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootMvcMiniProj01StudentManagementSystemApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BootMvcMiniProj01StudentManagementSystemApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BootMvcMiniProj01StudentManagementSystemApplication.class, args);
    }
}