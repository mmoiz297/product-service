package com.programming.techie.product.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.programming.techie.product.service.model.Product;
import com.programming.techie.product.service.repository.ProductRepository;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/list")
	public List<Product> findAll(Product product) {

		return productRepository.findAll();

	}

	@PostMapping("/create")
	public Product createProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Product> findAll() {

		return productRepository.findAll();

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct1(@RequestBody Product product) {
		productRepository.save(product);

	}

}
