package com.ekart.rest;

import static com.ekart.model.enums.ProductCategory.ELECTRONIC;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import com.ekart.model.Cart;
import com.ekart.model.Invoice;
import com.ekart.model.Product;
import com.ekart.service.InvoiceService;
import com.ekart.service.ProductService;

@RunWith(MockitoJUnitRunner.class)
public class CartControllerTest {
	
	@InjectMocks
	CartController classUnderTest;
	
	@Mock
	InvoiceService invoiceService;
	
	@Mock
	ProductService productService;
	
	@Test
	public void shouldCheckOutCart() {
		Cart cart = new Cart(1,2);
		Product product1 = new Product(1, "mobile", ELECTRONIC,10000.00, new Date(421445551l));
		Product product2 = new Product(2,"Television", ELECTRONIC, 20000.00, new Date(4214451l));
		Mockito.when(productService.getProduct(1)).thenReturn( product1);
		Mockito.when(productService.getProduct(2)).thenReturn( product2);
		List<Product> products=Arrays.asList(product1,product2);
		Invoice invoice=new Invoice();
		invoice.addProduct(product1);
		invoice.addProduct(product2);
		Mockito.when(invoiceService.createInvoice(products)).thenReturn(invoice);
		
		invoice = classUnderTest.checkOutCart(cart);
		
		Assert.assertEquals(products.size(),invoice.getInvoiceItem().size());
		Assert.assertEquals(product1.getPrice()+product2.getPrice(),invoice.getTotalPrice(),2);
	}

}
