package com.ekart.model;

import com.ekart.model.enums.ProductCategory;

public class ProductCategoryForm {
	private Integer id;
	private String name;

	public ProductCategoryForm(){}

	public ProductCategoryForm(ProductCategory productCategory) {
		this.id=productCategory.getId();
		this.name=productCategory.name();
	}

	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

}
