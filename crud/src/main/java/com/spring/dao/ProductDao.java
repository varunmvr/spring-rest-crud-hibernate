package com.spring.dao;

import java.util.List;

import com.spring.entity.Product;

public interface ProductDao {

	List getAllProducts();

	Product getProduct(String model);

	Product addProduct(Product product);

	void updateProduct(Product product);

	void deleteProduct(String model);

}
