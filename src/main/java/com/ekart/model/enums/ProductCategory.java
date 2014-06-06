package com.ekart.model.enums;

public enum ProductCategory {
	ELECTRONIC(1), CLOTHING(2), FOOTWARE(3);
	private Integer id;

	private ProductCategory(Integer id) {
		this.id=id;
	}
	
	public Integer getId(){
		return this.id;		
	}

	public static ProductCategory get(Integer categoryId) {
		for (ProductCategory productCategory : values()) {
			if(productCategory.getId()==categoryId){
				return productCategory;
			}
		}
		return null;
	} 
}
