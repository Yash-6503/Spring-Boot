package com.yw.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.document.Product;
import com.yw.repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	private ProductRepository prodRepo;
	
	@Override
	public String registerProduct(Product prod) {
		if(prod != null) {			
			String id = prodRepo.save(prod).getProdId();
			return "Product with Id "+id+" is saved successfully.....";
		}
		return "Product not saved....";
	}

	@Override
	public List<Product> showAllProducts() {
		return prodRepo.findAll();
	}

		@Override
		public String updateProduct(Product prod) {
			if (prod != null) {
		            Product updated = prodRepo.save(prod);
		            return "Product with Id: " + updated.getProdId() + " is updated successfully...";  
		    }
		    return "Product is data is empty....";		
		}

		@Override
		public Optional<Product> isIdAvailable(String id) {
			return prodRepo.findById(id);
		}

		@Override
		public String removeProduct(String id) {
			if(id != null) {
				prodRepo.deleteById(id);
				return "Product with Id: "+id+" deleted successfully....";
			}
			return "Product id is null......";
		}

}
