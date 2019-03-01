package com.soumyadeep.streamApi;

import java.util.HashMap;
import java.util.Map;

public class ProductList {

	public static void main(String[] args) {

		Map<String, Product> productsList = new HashMap<>();
		String value = "a";
		System.out.println(value.hashCode());
		// Adding Products
		productsList.put("4", new Product(4, "Sony Laptop", 28000f));
		productsList.put("5", new Product(5, "Apple Laptop", 90000f));
		productsList.put("4", new Product(41, "Sony Laptop111", 2111f));
		productsList.put("5", new Product(51, "Apple Laptop1111", 9111f));
		for (Map.Entry<String, Product> e : productsList.entrySet()) {

			System.out.println("HC= "+e.getKey().hashCode() + " Key= " + e.getKey() + " Value= " + e.getValue());
			
		}
		System.out.println(productsList);
	}
}
