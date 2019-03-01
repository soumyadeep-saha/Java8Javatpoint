package com.soumyadeep.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {

	public static void main(String[] args) {

		/*
		 * Java provides a new method forEach() to iterate the elements. It is defined
		 * in Iterable and Stream interface. It is a default method defined in the
		 * Iterable interface. Collection classes which extends Iterable interface can
		 * use forEach loop to iterate elements.
		 */
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println("------------Iterating by passing lambda expression--------------");
		list.forEach(p -> System.out.println(p));
	}
}
