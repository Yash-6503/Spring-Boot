package com.yw.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yw.document.Product;

public interface ProductRepository extends MongoRepository<Product, String>
{}
