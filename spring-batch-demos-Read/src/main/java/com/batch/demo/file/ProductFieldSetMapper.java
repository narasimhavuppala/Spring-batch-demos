/**
 * 
 */
package com.batch.demo.file;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

import com.batch.demo.model.Product;

public class ProductFieldSetMapper implements FieldSetMapper<Product> {
	public Product mapFieldSet(FieldSet fieldSet) {
		Product product = new Product();
		product.setId(fieldSet.readString("id"));
		product.setName(fieldSet.readString("name"));
		product.setDescription(fieldSet.readString("description"));
		product.setPrice(fieldSet.readFloat("price"));
		return product;
	}
}

