package com.ekart.model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

	private ArrayList<InvoiceItem> invoiceItems = new ArrayList<InvoiceItem>();;

	public List<InvoiceItem> getInvoiceItem() {
		return invoiceItems;
	}

	public void addProduct(Product product) {
		invoiceItems.add(new InvoiceItem(product.getName(), product.getPrice()));
	}

	public Double getTotalPrice() {
		Double totalPrice = 0.0;
		for (InvoiceItem invoiceItem : this.invoiceItems) {
			totalPrice += invoiceItem.getItemPrice();
		}
		return totalPrice;
	}
}
