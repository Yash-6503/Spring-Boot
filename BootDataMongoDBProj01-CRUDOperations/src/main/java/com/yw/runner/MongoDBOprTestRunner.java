package com.yw.runner;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yw.document.Product;
import com.yw.methods.Operations;
import com.yw.service.ProductServiceImpl;

@Component
public class MongoDBOprTestRunner implements CommandLineRunner {
	@Autowired
	private ProductServiceImpl prodService;

	@Override
	public void run(String... args) throws Exception {
		try (
			Scanner sc = new Scanner(System.in);
		){
			Integer choice;
			Product prod = new Product();
			do {
				System.out.println("\nMongoDB CRUD Operations");
				System.out.println("1. Register Product");
				System.out.println("2. See all Products");
				System.out.println("3. Update Product");
				System.out.println("4. Delete Product");
				System.out.println("5. Exit");
				System.out.println("Enter your choice: ");
				choice = Integer.parseInt(sc.nextLine());
				switch(choice) {
					case 1:
						Operations.registerProd(prodService);
						break;
						
					case 2:
						Operations.showProducts(prodService);
						break;
						
					case 3:
						Operations.updateProduct(prodService);
						break;
						
					case 4:
						Operations.deleteProduct(prodService);
						break;
						
					case 5:
						System.out.println("Exiting...");
						System.exit(0);
						
					default:
						System.out.println("Invalid Choice...");
				}
			}while(choice != 5);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
