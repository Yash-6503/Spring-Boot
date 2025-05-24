package com.yw.methods;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.yw.document.Product;
import com.yw.repository.ProductRepository;
import com.yw.service.ProductServiceImpl;

public class Operations {
	
	static Scanner sc = new Scanner(System.in);
	static Product prod = new Product();
	static List<Product> list = null;
	
	public static void registerProd(ProductServiceImpl prodService) {
		System.out.println("Enter Product Name: ");
		prod.setProdName(sc.nextLine());
		System.out.println("Enter Product Price: ");
		prod.setProdPrice(sc.nextDouble());
		System.out.println("Enter Product Quantity: ");
		prod.setProdQty(sc.nextInt());
		System.out.println("Enter Product Status: ");
		sc.nextLine();
		prod.setProdStatus(sc.nextLine());
		prod.setDate(LocalDate.now());
		String msg1 = prodService.registerProduct(prod);
		System.out.println(msg1);
	}
	
	public static void showProducts(ProductServiceImpl prodService) {
		list = prodService.showAllProducts();
		System.out.println("\nShowing all Products...");
		list.forEach(System.out::println);
	}
	
	public static void updateProduct(ProductServiceImpl prodService) {
		System.out.println("Enter product Id: ");
		prod.setProdId(sc.nextLine());
		
		Optional<Product> idAvailable = prodService.isIdAvailable(prod.getProdId());
		if(idAvailable.isPresent() == false) {
			System.out.println("\nProduct with Id: "+prod.getProdId()+" not found in the database...");
		}else {		
			Product prod1 = idAvailable.get();
			System.out.println("\nSelect Update Operation to Perform");
			System.out.println("1. Product Name");
			System.out.println("2. Product Price");
			System.out.println("3. Product Quantity");
			System.out.println("4. Return Back to Main Menu");
			System.out.println("Enter your choice: ");
			Integer choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
				case 1:
					System.out.println("Enter new Product Name: ");
					prod1.setProdName(sc.nextLine());
					String msg1 = prodService.updateProduct(prod1);
					System.out.println("\n"+msg1);
					break;
					
				case 2:
					System.out.println("Enter new Product Price: ");
					prod1.setProdPrice(Double.parseDouble(sc.nextLine()));
					String msg2 = prodService.updateProduct(prod1);
					System.out.println("\n"+msg2);
					break;
					
				case 3:
					System.out.println("Enter new Product Quantity: ");
					prod1.setProdQty(Integer.parseInt(sc.nextLine()));
					String msg3 = prodService.updateProduct(prod1);
					System.out.println("\n"+msg3);
					break;
					
				case 4:
					System.out.println("Returning back to Main Menu.....");
					break;
					
				default:
					System.out.println("Invalid choice....");
			}
		}
	}
	
	public static void deleteProduct(ProductServiceImpl prodService) {
		System.out.println("Enter Product Id: ");
		prod.setProdId(sc.nextLine());
		Optional<Product> idAvailable = prodService.isIdAvailable(prod.getProdId());
		if(idAvailable.isPresent() == false) {
			System.out.println("\nProduct with Id: "+prod.getProdId()+" not found in the database...");
		}else {
			String msg = prodService.removeProduct(prod.getProdId());
			System.out.println("\n"+msg);
		}
	}
}
