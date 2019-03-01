package com.soumyadeep.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethodReferrence {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println("------------Iterating by passing method referrence--------------");
		list.forEach(System.out::println);
	}
}
