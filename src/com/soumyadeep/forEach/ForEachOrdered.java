package com.soumyadeep.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrdered {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("c");
		list.add("d");
		list.add("a");
		list.add("b");
		list.add("d");
		list.add("a");
		list.add("b");
		System.out.println("------------Iterating by passing lambda expression--------------");
		list.stream().forEachOrdered(p -> System.out.println(p));
		System.out.println("------------Iterating by passing method referrence--------------");
		list.stream().forEachOrdered(System.out::println);
	}
}
