package com.soumyadeep.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsSumIntDouble {

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
		
		int ids = productList.stream()
				.collect(Collectors.summingInt(mapper -> mapper.id));
		System.out.println(ids);
		
		double prices = productList.stream()
				.collect(Collectors.summingDouble(m -> m.price));
		System.out.println(prices);
		
		Integer ids1 = productList.stream()
				.collect(Collectors.summingInt(mapper -> mapper.id));
		System.out.println(ids1);
		
		Double prices1 = productList.stream()
				.collect(Collectors.summingDouble(m -> m.price));
		System.out.println(prices1);
	}
}
