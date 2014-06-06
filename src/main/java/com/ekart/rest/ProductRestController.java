package com.ekart.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ekart.model.Product;
import com.ekart.service.ProductService;

@Path("/product")
@Component
public class ProductRestController {
	@Autowired
	ProductService productService;

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@PathParam ("id")Integer id){
		return productService.getProduct(id);
	}
}
