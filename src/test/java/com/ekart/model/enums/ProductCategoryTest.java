package com.ekart.model.enums;

import static com.ekart.model.enums.ProductCategory.ELECTRONIC;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProductCategoryTest {

	@Test
	public void shouldReturnProductCategoryAccordingId() {
		ProductCategory productCategory = ProductCategory.get(ELECTRONIC.getId());
		assertEquals(productCategory.getId(), ELECTRONIC.getId());
		assertEquals(productCategory.name(), ELECTRONIC.name());
	}

}
