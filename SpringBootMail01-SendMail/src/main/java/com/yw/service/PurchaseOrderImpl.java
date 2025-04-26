package com.yw.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service("purchaseService")
public class PurchaseOrderImpl implements IPurchaseOrder {

	@Autowired
	private JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	private String fromEmail;
	
	@Override
	public String purchase(String[] items, double[] prices, String[] toEmails) throws Exception 
	{
		//calculate total bill amount
		double totalBillAmt = 0.0;
		for(double price : prices)
			totalBillAmt+=price;
		
		//create one message of all..
		String msg = Arrays.toString(items)+ " with prices "+Arrays.toString(prices)+" are purchased with total bill amount "+totalBillAmt;
		
		//send mail.
		String status = sendMail(msg,toEmails);
		
		return status;
	}
	
	public String sendMail(String msg, String []toEmails) throws Exception 
	{
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		helper.setFrom(fromEmail);
		helper.setCc(toEmails);
		helper.setSubject("open it to read it");
		helper.setSentDate(new Date());
		helper.setText(msg);
		helper.addAttachment("tiger.png", new ClassPathResource("tiger.png"));
		sender.send(message);
		return "Mail sent successfully....";
	}

}
