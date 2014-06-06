package com.ekart.model;

public class InvoiceItem {

	private String itemName;
	private Double itemPrice;

	public InvoiceItem(String itemName, Double itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public InvoiceItem() {
	}

	public String getItemName() {
		return itemName;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

}
