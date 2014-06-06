package com.ekart.model;

import java.util.Date;

import com.ekart.model.enums.ProductCategory;

public class Product {

	private String name;
	private int productId;
	private ProductCategory category;
	private double price;
	private Date manufacturingDate;

	public Product(){}

	public Product(int id, String name, ProductCategory category, double price, Date manufacturingDate) {
		this.productId=id;
		this.name=name;
		this.category=category;
		this.price=price;
		this.manufacturingDate=manufacturingDate;
	}

	public String getName() {
		return name;
	}

	public String getCategoryName() {
		return this.category.name();
	}

	public Double getPrice() {
		return price;
	}

	public Date getManufacturingDate() {
		return this.manufacturingDate;
	}

	public Integer getProductId() {
		return productId;
	}
   
}
