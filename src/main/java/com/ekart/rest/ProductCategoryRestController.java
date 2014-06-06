package com.ekart.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ekart.model.Product;
import com.ekart.model.ProductCategoryForm;
import com.ekart.model.enums.ProductCategory;
import com.ekart.service.ProductCategoryService;
import com.ekart.service.ProductService;

@Component
@Path("/category")
public class ProductCategoryRestController {

	@Autowired
	private ProductCategoryService productCategoryService;
	
	@Autowired
	private ProductService productService;
	
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<ProductCategoryForm> getAllCategories() {
		List<ProductCategoryForm> categoryForms=new ArrayList<ProductCategoryForm>();
		 for (ProductCategory productCategory : productCategoryService.getAllProductCategories()) {
			 categoryForms.add(new ProductCategoryForm(productCategory));
		}
		return categoryForms;
	}

	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("{id}")
	public List<Product> getAllProductsForCategory(@PathParam("id") Integer id) {
		ProductCategory productCategory =ProductCategory.get(id);
		return productService.getProductsForCategory(productCategory);
	}

}
