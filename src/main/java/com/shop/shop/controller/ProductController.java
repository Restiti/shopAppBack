package com.shop.shop.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.shop.model.Product;
import com.shop.shop.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

	private final ProductService productService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProduct(){
		List<Product> allProd = productService.findAllProduct();
		return new ResponseEntity<>(allProd, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") Long id){
		Product p = productService.findProductById(id);
		return new ResponseEntity<>(p, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Product> addEmploye(@RequestBody Product product){
		Product p = productService.addProduct(product);
		return new ResponseEntity<>(p, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product){
		Product p = productService.updateProduct(product);
		return new ResponseEntity<>(p, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
		productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
