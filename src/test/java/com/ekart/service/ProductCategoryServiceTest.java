package com.ekart.service;

import static com.ekart.model.enums.ProductCategory.CLOTHING;
import static com.ekart.model.enums.ProductCategory.ELECTRONIC;
import static com.ekart.model.enums.ProductCategory.FOOTWARE;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ekart.dao.ProductCategoryDAO;
import com.ekart.model.enums.ProductCategory;

@RunWith(MockitoJUnitRunner.class)
public class ProductCategoryServiceTest {

	@Mock
	ProductCategoryDAO productCategoryDAO;
	
	@InjectMocks
	ProductCategoryService productCategoryService;
	
	@Ignore
	@Test
	public void shouldReturnAllCategories() {
		List<ProductCategory> expected = Arrays.asList(ELECTRONIC,CLOTHING,FOOTWARE);
		when(productCategoryDAO.getAllCategories()).thenReturn(expected);
		
		List<ProductCategory> actual = productCategoryService.getAllProductCategories();
		
		Assert.assertEquals(expected, actual);
	}

}
