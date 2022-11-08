package com.shop.shop.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.shop.shop.model.Product;

public interface ProductDao extends JpaRepository<Product, Long> {
	
	Optional<Product> findProductByIdProduct(Long id);
}
