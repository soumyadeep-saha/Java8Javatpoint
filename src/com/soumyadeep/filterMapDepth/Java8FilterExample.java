package com.soumyadeep.filterMapDepth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8FilterExample {

	public static void main(String[] args) {

		/*
		 * Suppose we have a list of integer numbers and we want to find the first
		 * number which is divisible by both 2 and 3, let' see how to solve this problem
		 * in Java 8.
		 */

		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18);
		Integer divisiby2and3 = listOfNumbers.stream().filter(predicate -> predicate % 2 == 0)
				.filter(predicate -> predicate % 3 == 0).findFirst().get();
		System.out.println("number which is divisible by both 2 and 3: " + divisiby2and3);

		List<String> versions = new ArrayList<>();
		versions.add("Lollipop");
		versions.add("KitKat");
		versions.add("Jelly Bean");
		versions.add("Ice Cream Sandwidth");
		versions.add("Honeycomb");
		versions.add("Gingerbread");

		// Using one filter()
		// print all versions whose length is greater than 10 character
		System.out.println("All versions whose length greater than 10");
		versions.stream().filter(p -> p.length() > 10).forEach(p -> System.out.println(p));

		System.out.println("first element which has letter 'e' ");
		String letterHasE = versions.stream().filter(p -> p.contains("e")).findFirst().get();
		System.out.println(letterHasE);

		// Using multiple filter
		System.out.println("Element whose length is > 5 and startswith G");
		versions.stream().filter(p -> p.length() > 5).filter(p -> p.startsWith("G"))
				.forEach(p -> System.out.println(p));

	}
}
