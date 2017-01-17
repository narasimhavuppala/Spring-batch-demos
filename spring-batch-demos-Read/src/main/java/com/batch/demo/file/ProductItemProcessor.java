package com.batch.demo.file;

import org.springframework.batch.item.ItemProcessor;

import com.batch.demo.model.Product;

public class ProductItemProcessor implements ItemProcessor<Product, Product> {

	@Override
	public Product process(Product paramI) throws Exception {

		
		System.out.println("Entered processsor");
		return paramI;
	}

}
