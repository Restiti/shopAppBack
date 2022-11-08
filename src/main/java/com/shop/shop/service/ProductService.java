package com.shop.shop.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;

import com.shop.shop.data.ProductDao;
import com.shop.shop.model.Product;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class ProductService {
	
	private final ProductDao productDao;
	
	
	public Product addProduct(Product product) {
		return productDao.save(product);
	}
	
	public List<Product> findAllProduct(){
		return productDao.findAll();
	}
	
	public Product updateProduct(Product product) {
		return productDao.save(product);
	}
		
	public Product findProductById(Long id) {
		return productDao.findProductByIdProduct(id)
				.orElseThrow(() -> new ProductNotFoundExeption("Product not found") );
	}
	
	public void deleteProduct(Long id) {
		productDao.deleteById(id);
	}
	
}
