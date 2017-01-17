/**
 * 
 */
package com.batch.demo.file;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.batch.demo.model.Product;

/**
 *
 */
public class ProductItemWriter implements ItemWriter<Product> {
	
	public List<Product> products = new ArrayList<Product>();

	/* (non-Javadoc)
	 * @see org.springframework.batch.item.ItemWriter#write(java.util.List)
	 */
	@Override
	public void write(List<? extends Product> items) throws Exception {
		
//		for(Product p: items){
//			System.out.println(p);
//		}
		products.addAll(items);
		System.out.println("items = "+items.size() + " And latest processed Size=" + products.size());
	}

	public List<Product> getProducts() {
		return products;
	}
}
