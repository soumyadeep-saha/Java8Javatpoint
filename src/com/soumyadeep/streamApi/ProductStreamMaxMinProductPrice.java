package com.soumyadeep.streamApi;

import java.util.ArrayList;
import java.util.List;

public class ProductStreamMaxMinProductPrice {

	public static void main(String[] args) {

		List<ProductStream> productList = new ArrayList<>();

		productList.add(new ProductStream(1, "a", 1.0f));
		productList.add(new ProductStream(2, "b", 2.0f));
		productList.add(new ProductStream(3, "c", 3.0f));
		productList.add(new ProductStream(4, "d", 4.0f));
		productList.add(new ProductStream(5, "e", 5.0f));
		productList.add(new ProductStream(6, "f", 6.0f));
		productList.add(new ProductStream(7, "g", 7.0f));
		productList.add(new ProductStream(8, "h", 8.0f));
		productList.add(new ProductStream(9, "i", 9.0f));
		productList.add(new ProductStream(10, "j", 10.0f));

		ProductStream pmax = productList.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println(pmax);

		ProductStream pmin = productList.stream().min((p1, p2) -> p1.price > p2.price ? 1 : -1).get();
		System.out.println(pmin);

	}
}
