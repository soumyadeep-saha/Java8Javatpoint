package com.soumyadeep.streamApi;

import java.util.stream.Stream;

public class ProductStreamIterating {

	public static void main(String[] args) {

		Stream.iterate(1, p -> p+1)
		.filter(p -> p%10==0)
		.limit(11)
		.forEach(p -> System.out.println(p));
		
		Stream.iterate(1, p -> p+1)
		.limit(10)
		.forEach(p -> System.out.println(p));
		
		Stream.iterate(1, e -> e+1)
		.limit(20)
		.forEach(p -> System.out.println(p));
	}
}
