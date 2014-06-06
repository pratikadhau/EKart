package com.ekart.service;

import static com.ekart.model.enums.ProductCategory.CLOTHING;
import static com.ekart.model.enums.ProductCategory.ELECTRONIC;
import static com.ekart.model.enums.ProductCategory.FOOTWARE;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ekart.model.enums.ProductCategory;

@Service
public class ProductCategoryService {
	
	
	public List<ProductCategory> getAllProductCategories() {
		return Arrays.asList(CLOTHING,ELECTRONIC,FOOTWARE);
	}

}
