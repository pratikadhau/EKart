package com.ekart.dao;

import static com.ekart.model.enums.ProductCategory.CLOTHING;
import static com.ekart.model.enums.ProductCategory.ELECTRONIC;
import static com.ekart.model.enums.ProductCategory.FOOTWARE;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ekart.model.enums.ProductCategory;

@Component
public class ProductCategoryDAO {

	public List<ProductCategory> getAllCategories() {
		
		return Arrays.asList(CLOTHING,ELECTRONIC,FOOTWARE);
	}

}
