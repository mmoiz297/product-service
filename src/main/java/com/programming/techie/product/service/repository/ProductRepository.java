package com.programming.techie.product.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.programming.techie.product.service.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>  {

}
