package com.ekart.model;

import static com.ekart.model.enums.ProductCategory.ELECTRONIC;
import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class ProductTest {

	@Test
	public void shouldHaveNameIdPriceCAtegory() {
		String name = "Mobile";
		double price = 10000.00;
		Date manufacturingDate = new Date(1l);
		Product product=new Product(1,name,ELECTRONIC,price,manufacturingDate);
		assertEquals(name, product.getName());
		assertEquals(ELECTRONIC.name(), product.getCategoryName());
		assertEquals(price, product.getPrice(),2);
		assertEquals(manufacturingDate, product.getManufacturingDate());
	}

}
