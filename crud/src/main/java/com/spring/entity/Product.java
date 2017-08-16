package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="product")
public class Product {
@Column(name="name")
private String name;
@Column(name="make")
private String make;
@Id
@Column(name ="model")
private String model;
@Column(name="price")
private float price;
@Column(name="description")
private String description;
@Column(name="review")
private String review;

public Product() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getReview() {
	return review;
}
public void setReview(String review) {
	this.review = review;
}

@Override
public String toString() {
	return "Product [name=" + name + ", make=" + make + ", model=" + model + ", price=" + price + ", description="
			+ description + ", review=" + review + "]";
}

}
