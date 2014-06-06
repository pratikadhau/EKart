package com.ekart.service;

import static com.ekart.model.enums.ProductCategory.CLOTHING;
import static com.ekart.model.enums.ProductCategory.ELECTRONIC;
import static com.ekart.model.enums.ProductCategory.FOOTWARE;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.ListUtils;
import org.springframework.stereotype.Service;

import com.ekart.model.Product;
import com.ekart.model.enums.ProductCategory;

@Service
public class ProductService {
	static Map<Integer, Product> productMap=new HashMap<Integer,Product>();
	static{
		Product product1 = new Product(1, "mobile", ELECTRONIC,10000.00, new Date(421445551l));
		productMap.put(1, product1);
		Product product2 = new Product(2,"Television", ELECTRONIC, 20000.00, new Date(4214451l));
		productMap.put(2, product2);
		Product product3 = new Product(3, "Camera", ELECTRONIC, 8000.00, new Date(	42144555l));
		productMap.put(3,  product3);
		Product product4 = new Product(4, "Trouser", CLOTHING,1000.00, new Date(4214451l));
		productMap.put(4,  product4);
		Product product5 = new Product(5,"T-shirt", CLOTHING, 800.00, new Date(421445188l));
		productMap.put(5, product5);
		Product product6 = new Product(6, "Denim", CLOTHING, 1500.00, new Date(72144555l));
		productMap.put(6,  product6);
		productMap.put(7, new Product(7, "Shoe", FOOTWARE,1500.00, new Date(3214451l)));
		productMap.put(8, new Product(8,"Floater", CLOTHING, 600.00, new Date(921445188l)));
		productMap.put(9, new Product(9, "Sleeper", CLOTHING, 400.00, new Date(88144555l)));
	}
	
	@SuppressWarnings("unchecked")
	public List<Product> getProductsForCategory(ProductCategory productCategory) {
		List<Product> productList = null;
		switch (productCategory) {
		case ELECTRONIC:
			Product product1 = new Product(1, "mobile", ELECTRONIC,10000.00, new Date(421445551l));
			Product product2 = new Product(2,"Television", ELECTRONIC, 20000.00, new Date(4214451l));
			Product product3 = new Product(3, "Camera", ELECTRONIC, 8000.00, new Date(	42144555l));
			productList = Arrays.asList(product1, product2, product3);
			break;
		case CLOTHING:
			Product product4 = new Product(4, "Trouser", CLOTHING,1000.00, new Date(4214451l));
			Product product5 = new Product(5,"T-shirt", CLOTHING, 800.00, new Date(421445188l));
			Product product6 = new Product(6, "Denim", CLOTHING, 1500.00, new Date(72144555l));
			productList = Arrays.asList(product4,product5,product6);
			break;
		case FOOTWARE:
			Product product7 = new Product(7, "Shoe", FOOTWARE,1500.00, new Date(3214451l));
			Product product8 = new Product(8,"Floater", CLOTHING, 600.00, new Date(921445188l));
			Product product9 = new Product(9, "Sleeper", CLOTHING, 400.00, new Date(88144555l));
			productList = Arrays.asList(product7,product8,product9);
			break;
		default:
			productList=ListUtils.EMPTY_LIST;
		}

		return productList;
	}

	public Product getProduct(Integer id){
		return productMap.get(id);
	}
}
