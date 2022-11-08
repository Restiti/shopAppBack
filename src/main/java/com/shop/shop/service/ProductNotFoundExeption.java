package com.shop.shop.service;

public class ProductNotFoundExeption extends RuntimeException{
	public ProductNotFoundExeption(String message) {
        super(message);
    }
}
