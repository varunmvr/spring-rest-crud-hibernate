package com.spring.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.ProductDao;
import com.spring.entity.Product;
@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	private ProductDao productdao;
	@Transactional
	public List getAllProducts() {
		// TODO Auto-generated method stub
		
		return productdao.getAllProducts();
	}
	@Transactional
	public Product getProduct(String model) {
		// TODO Auto-generated method stub
		return productdao.getProduct(model);
	}
	@Transactional
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productdao.addProduct(product);
		
	}
	@Transactional
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productdao.updateProduct(product);
	}
	@Transactional
	public void deleteproduct(String model) {
		// TODO Auto-generated method stub
		productdao.deleteProduct(model);
		
	}

}
