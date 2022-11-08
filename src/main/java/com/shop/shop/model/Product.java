package com.shop.shop.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@AllArgsConstructor
@Getter
public class Product {
	
	@Id
	@SequenceGenerator(
			name = "student_sequence",
			sequenceName = "student_sequence",
			allocationSize = 1   
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
			)
	private Long idProduct;
	private String name;
	@Enumerated(EnumType.STRING)
	private Category categorie;
	private double price;
	private String imgUrl;
		
	public Product(String name, Category categorie, double price, String imgUrl) {
		super();
		this.name = name;
		this.categorie = categorie;
		this.price = price;
		this.imgUrl = imgUrl;
	}

	public Product() {
		super();
	}
	
}
