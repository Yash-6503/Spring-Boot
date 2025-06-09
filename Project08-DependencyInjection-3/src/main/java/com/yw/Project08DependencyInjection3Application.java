package com.yw;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.yw.model.Camera;
import com.yw.model.Mobile;
import com.yw.model.Processor;

@SpringBootApplication
public class Project08DependencyInjection3Application {

	public static void main(String[] args) {
		
		// creating object of Application Context / IOC container
		ApplicationContext ctx = SpringApplication.run(Project08DependencyInjection3Application.class, args);
		
		
		// creating object for mobile from bean/component through IOC container
		Mobile mobile = ctx.getBean(Mobile.class);
		
		// creating object for camera from bean/component through IOC container
		Processor processor =  ctx.getBean(Processor.class);
		
		// creating object for camera from bean/component through IOC container
		Camera camera =  ctx.getBean(Camera.class);

		System.out.println("\nDependency Injection Tester...");
		
		// setting processor data
		processor.setSerialNumber(1122334455);
		processor.setBrandName("MediaTech Helio G70");
		processor.setSpecialization("Excellent Gaming Performance..");
		
		// setting camera data
		camera.setBrandName("Realme");
		camera.setPixels("48mp");
		camera.setSpecialization("A1 Camera capture the Memory");
		camera.setIsNightMode(true);
		
		// setting mobile data
		mobile.setIMEI_Number(666221551);
		mobile.setModelName("RMX2020");
		mobile.setMobileName("Realme Narzo 10A");
		mobile.setMfgDate(LocalDate.of(2020,10,10));
		mobile.setRam("4gb");
		mobile.setStorage("64gb");
		mobile.setPrice(22000.211);
		mobile.setIs5g(true);
		// setting processor object to mobile class
		mobile.setProcessor(processor);
		// setting camera object to mobile class
		mobile.setCamera(camera);
		
		// displaying mobile info
		System.out.println("All Information About Mobile....");
		System.out.println(mobile);
		
		// closing application context object
		((ConfigurableApplicationContext) ctx).close();
	}

}
