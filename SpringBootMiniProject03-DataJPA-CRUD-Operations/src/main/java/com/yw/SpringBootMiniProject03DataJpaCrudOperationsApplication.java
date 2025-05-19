package com.yw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.yw.runner.RunnerClass;

@SpringBootApplication
public class SpringBootMiniProject03DataJpaCrudOperationsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootMiniProject03DataJpaCrudOperationsApplication.class, args);
		
		RunnerClass.startApp(ctx);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
