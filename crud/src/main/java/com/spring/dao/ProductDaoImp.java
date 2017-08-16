package com.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.entity.Product;

@Repository
public class ProductDaoImp implements ProductDao {
	 @Autowired
	 private SessionFactory sessionFactory;

	public List getAllProducts() {
		Session session = this.sessionFactory.getCurrentSession();
		  List productList = session.createQuery("from Product").list();
		  return productList;
	}

	public Product getProduct(String model) {
		Session session = this.sessionFactory.getCurrentSession();
		  Product product = (Product) session.get(Product.class,model);
		  return product;
	}

	public Product addProduct(Product product) {
		Session session = this.sessionFactory.getCurrentSession();
		  session.persist(product);
		  return product;
	}

	public void updateProduct(Product product) {
		Session session = this.sessionFactory.getCurrentSession();
		  session.update(product);
		
	}

	public void deleteProduct(String model) {
		Session session = this.sessionFactory.getCurrentSession();
		Product p = (Product) session.load(Product.class,model);
		  if (null != p) {
		   session.delete(p);
		  }
		
	}

}
