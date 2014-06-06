package com.ekart.service;

import static com.ekart.model.enums.ProductCategory.ELECTRONIC;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ekart.dao.ProductDAO;
import com.ekart.model.Product;
@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

	@Mock
	ProductDAO productDAO;
	@InjectMocks
	ProductService productService;
	

	@Test
	public void shouldReturnAllProductsForGivenCategory() {
		
		List<Product> actual = productService.getProductsForCategory(ELECTRONIC);
	
		Assert.assertEquals(3 , actual.size());
	}

	@Test
	public void shouldReturnProduct(){
		Product product = productService.getProduct(1);
		Assert.assertNotNull(product);
	}
}
