package com.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Product;
import com.spring.service.ProductService;

@RestController
@RequestMapping("/rest")
public class ProductController {
 
@Autowired
ProductService productService;
 
 @RequestMapping(value = "/product", method = RequestMethod.GET, headers = "Accept=application/json")
 public List getProducts() {
  
 List listOfProducts = productService.getAllProducts();
 return listOfProducts;
 }
 
 @RequestMapping(value = "/product/{model}", method = RequestMethod.GET, headers = "Accept=application/json")
 public Product getProductByModel(@PathVariable String model) {
  return productService.getProduct(model);
 }
 
 @RequestMapping(value = "/product", method = RequestMethod.POST, headers = "Accept=application/json")
 public void addProduct(@RequestBody Product product) { 
  productService.addProduct(product);
  
 }
 
 @RequestMapping(value = "/product", method = RequestMethod.PUT, headers = "Accept=application/json")
 public void updateProduct(@RequestBody Product product) {
  productService.updateProduct(product);
 }
 
 @RequestMapping(value = "/product/{model}", method = RequestMethod.DELETE, headers = "Accept=application/json")
 public void deleteProduct(@PathVariable("model") String model) {
  productService.deleteproduct(model);  
 } 
}