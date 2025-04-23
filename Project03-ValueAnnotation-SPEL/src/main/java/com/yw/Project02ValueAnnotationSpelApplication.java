package com.yw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.yw.sbeans.CourseContent;
import com.yw.sbeans.Institute;

@SpringBootApplication
public class Project02ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Project02ValueAnnotationSpelApplication.class, args);
		
		CourseContent cnt = ctx.getBean("cc",CourseContent.class);
		
		Institute inst = ctx.getBean("ins",Institute.class);
		
		System.out.println(cnt);
		
		System.out.println(inst);
	}

}
