package com.ekart.model;

import org.junit.Assert;
import org.junit.Test;

import com.ekart.model.enums.ProductCategory;

public class ProductCategoryFormTest {

	@Test
	public void shouldCreateProductCategoryForm() {
		ProductCategory expected = ProductCategory.ELECTRONIC;
		ProductCategoryForm actual=new ProductCategoryForm(expected);
		Assert.assertEquals(expected.getId(), actual.getId());
		Assert.assertEquals(expected.name(), actual.getName());
	}

}
