package com.soumyadeep.filterMapDepth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8MapExample {

	/*
	 * Java 8 example to convert each element of List into upper case. You can use
	 * Map function of Java 8 to transform each element of List or any collection.
	 */

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("London", "HongKong", "Paris", "NewYork");
		System.out.println("Original list : " + cities);
		System.out.println("list transformed using Java 8 :" + transform(cities));
		System.out.println("list transformed using loop before Java 8 : " + beforeJava8(cities));
	}

	/**
	 * This is how you convert all elements of list into upper case using loop
	 * before Java 8
	 * 
	 * @param listOfString
	 * @return List with each element converted into upper case
	 */

	private static List<String> beforeJava8(List<String> cities) {

		List<String> upperCities = new ArrayList<>();
		for (String list : cities) {
			upperCities.add(list.toUpperCase());
		}
		return upperCities;
	}

	private static List<String> transform(List<String> cities) {

		List<String> upperCities = cities.stream().map(mapper -> mapper.toUpperCase()).collect(Collectors.toList());
		return upperCities;
	}
}
