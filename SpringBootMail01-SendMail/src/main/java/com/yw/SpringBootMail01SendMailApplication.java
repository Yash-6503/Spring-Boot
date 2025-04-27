package com.yw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.yw.service.IPurchaseOrder;

@SpringBootApplication
public class SpringBootMail01SendMailApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootMail01SendMailApplication.class, args);
		
		IPurchaseOrder order = ctx.getBean("purchaseService",IPurchaseOrder.class);
		
		String [] items = {"T-Shirts","Shoes","Jackets","Jeans"};
		double [] prices = {700.32, 2500.45, 1500.25, 1999.99};
		String [] emails = {"yashwalke6503@gmail.com", "yashwalke06@gmail.com"};
		
		try {
			String message = order.purchase(items, prices, emails);
			
			System.out.println(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();
	}

}


/* Output
Mail sent successfully...
*/