package com.soumyadeep.filterMapDepth;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersFromList {
	
	public static void main(String[] args) {
		
		List<String> listString = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
		System.out.print("Original list in string format: "+listString);
		System.out.println();
		
		List<Integer> listEvenInteger = 
				listString.stream().map(mapper -> Integer.valueOf(mapper))
				.filter(predicate -> predicate%2==0)
				.collect(Collectors.toList());
		System.out.println("After processing Integer list with even numbers: "+ listEvenInteger);
	}
}
