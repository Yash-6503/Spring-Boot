package com.yw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yw.sender.MessageSender;

@SpringBootApplication
public class BootJmsProj01SenderAppApplication implements CommandLineRunner 
{
	@Autowired
	private MessageSender sender;
	
	public static void main(String[] args) {
		SpringApplication.run(BootJmsProj01SenderAppApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception 
	{
			sender.sendMessage("test-queue2", "Hello, I am Sender!!");
			System.out.println("Message Sent....");
	}
	
}
