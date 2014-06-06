package com.ekart.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ekart.model.Cart;
import com.ekart.model.Invoice;
import com.ekart.model.Product;
import com.ekart.service.InvoiceService;
import com.ekart.service.ProductService;

@Path("/cart")
@Component
public class CartController {
	@Autowired
	ProductService productService;
	
	@Autowired
	InvoiceService invoiceService;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Invoice checkOutCart(Cart cart) {
		List<Product> products=new ArrayList<Product>();
		for (Integer productId : cart.getProductIds()) {
			products.add(productService.getProduct(productId));
		}
		return invoiceService.createInvoice(products);
		
	}

}
