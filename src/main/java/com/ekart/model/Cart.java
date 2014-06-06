package com.ekart.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Integer> productIds=new ArrayList<Integer>();

	public Cart() {	}
	
	
	public Cart(Integer ...productIds) {
		for (Integer productId : productIds) {
			this.productIds.add(productId);
		}
	}


	public List<Integer> getProductIds() {
		return productIds;
	}

	public void setProductIds(List<Integer> productIds) {
		this.productIds = productIds;
	}
}
