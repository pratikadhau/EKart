package com.ekart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ekart.model.Invoice;
import com.ekart.model.Product;

@Service
public class InvoiceService {

	public Invoice createInvoice(List<Product> products) {
		Invoice invoice = new Invoice();
		for (Product product : products) {
			invoice.addProduct(product);
		}
		return invoice;
	}

}
