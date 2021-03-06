package com.soumyadeep.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToSet {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();

		productList.add(new Product(1, "a", 1.0f));
		productList.add(new Product(2, "b", 2.0f));
		productList.add(new Product(3, "c", 3.0f));
		productList.add(new Product(4, "d", 4.0f));
		productList.add(new Product(5, "e", 5.0f));
		productList.add(new Product(6, "f", 6.0f));
		productList.add(new Product(7, "g", 7.0f));
		productList.add(new Product(8, "h", 8.0f));
		productList.add(new Product(9, "i", 9.0f));
		productList.add(new Product(10, "j", 10.0f));
		
		List<Float> priceList = productList.stream()
				.map(mapper -> mapper.price)
				.collect(Collectors.toList());
		System.out.println(priceList);
	}
}
