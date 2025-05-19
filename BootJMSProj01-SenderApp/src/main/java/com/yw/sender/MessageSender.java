package com.yw.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender 
{
	@Autowired
	private JmsTemplate template;
	
	public void sendMessage(String destination, String message) {
		//using Lamba exp
//		template.send("testmq1",ses -> ses.createTextMessage("From sender at : "+new Date()));
		template.convertAndSend(destination,message);
		System.out.println("Message Sent...");
	}
}
