package com.soumyadeep.streamApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductStreamTest {
	
	public static void main(String[] args) {
		
		Map<ProductStream, Integer> productList = new HashMap<>(); 

		ProductStream p1 = new ProductStream(1, "a", 1.0f);
		ProductStream p2 = new ProductStream(2, "b", 2.0f);
		ProductStream p3 = new ProductStream(2, "b", 2.0f);
		ProductStream p4 = new ProductStream(4, "d", 4.0f);
		
		productList.put(p1,1);
		productList.put(p2,2);
		productList.put(p3,3);
		productList.put(p4,4);
		productList.put(p1,5);
		
		System.out.println(productList.get(p1));
		

		
	}
}
