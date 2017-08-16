package com.spring.service;

import java.util.List;

import com.spring.entity.Product;

public interface ProductService {

	List getAllProducts();

	Product getProduct(String model);

	void addProduct(Product product);

	void updateProduct(Product product);

	void deleteproduct(String model);

}
