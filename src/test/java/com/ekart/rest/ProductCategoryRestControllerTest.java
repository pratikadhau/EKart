package com.ekart.rest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ekart.model.Product;
import com.ekart.model.ProductCategoryForm;
import com.ekart.model.enums.ProductCategory;
import com.ekart.service.ProductCategoryService;
import com.ekart.service.ProductService;

@RunWith(MockitoJUnitRunner.class)
public class ProductCategoryRestControllerTest {
	@Mock
	ProductCategoryService productCategoryServices;
	@Mock
	ProductService productService;
	
	@InjectMocks
	ProductCategoryRestController productCategoryRestController;
	
	@Test
	public void shouldReturnAllCategories() {
		List<ProductCategory> expectedProductCategories=Arrays.asList(ProductCategory.ELECTRONIC,ProductCategory.CLOTHING,ProductCategory.FOOTWARE);
		when(productCategoryServices.getAllProductCategories()).thenReturn(expectedProductCategories);
		
		List<ProductCategoryForm> actualProductCategories=productCategoryRestController.getAllCategories();
		
		assertEquals(expectedProductCategories.size(), actualProductCategories.size());
	}

	@Test
	public void shouldReturnAllProductsForGivenCategory() throws Exception {
		Integer categoryId=1;
		List<Product> expected=Arrays.asList(new Product(),new Product());
		when(productService.getProductsForCategory(ProductCategory.get(categoryId))).thenReturn(expected);
		
		List<Product> actual=productCategoryRestController.getAllProductsForCategory(categoryId);
		
		assertEquals(expected.size(), actual.size());
	}
}
