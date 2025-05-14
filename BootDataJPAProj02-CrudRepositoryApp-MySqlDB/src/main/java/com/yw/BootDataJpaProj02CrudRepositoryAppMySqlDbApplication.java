/*
BootDataJPAProject02 -  Crud Repository Application using MySQL-DB
*/

package com.yw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.yw.entities.Actor;
import com.yw.service.IActorService;

@SpringBootApplication
public class BootDataJpaProj02CrudRepositoryAppMySqlDbApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(BootDataJpaProj02CrudRepositoryAppMySqlDbApplication.class, args);
		
		IActorService service = ctx.getBean("actorService", IActorService.class);
		
		try {
			Actor actor = new Actor();
			actor.setActorName("Salman Khan");
			actor.setActorRole("Hero");
			actor.setActorFee(67990.32);			
			String msg = service.registerActor(actor);
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}

		((ConfigurableApplicationContext) ctx).close();
	}

}
