package com.soumyadeep.lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionComparator {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("id2","name2","price2"));
		list.add(new Product("id1","name1","price1"));
		list.add(new Product("id4","name4","price4"));
		list.add(new Product("id3","name3","price3"));
		
		System.out.println("Before Sorting::");
		for(Product p : list) {
			System.out.println(p.id + " "+ p.name + " "+ p.price);
		}

		Collections.sort(list,(p1,p2) ->{
			return p1.name.compareTo(p2.name);
		});
		System.out.println("After Sorting by name::");
		for(Product p : list) {
			System.out.println(p.id + " "+ p.name + " "+ p.price);
		}
	}
}
