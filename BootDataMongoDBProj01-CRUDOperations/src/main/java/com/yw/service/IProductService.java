package com.yw.service;

import java.util.List;
import java.util.Optional;

import com.yw.document.Product;

public interface IProductService {
	public String registerProduct(Product prod);
	public List<Product> showAllProducts();
	public String updateProduct(Product prod);
	public  Optional<Product> isIdAvailable(String id);
	public String removeProduct(String id);
}
