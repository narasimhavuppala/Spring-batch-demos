package com.batch.demo.file;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.batch.demo.model.Product;

public class myItemReader implements ItemReader<Product> {

	@Override
	public Product read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("In Reader");
		return new Product();
	}

}
