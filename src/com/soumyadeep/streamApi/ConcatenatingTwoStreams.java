package com.soumyadeep.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenatingTwoStreams {

	public static void main(String[] args) {

		List<String> l1 = Arrays.asList("a","b","c","d","e");
		
		List<String> l2 = Arrays.asList("f","g","h","i","j");
		
		Stream<String> result = Stream.concat(l1.stream(), l2.stream());

		result.forEach(s -> System.out.println(s));
	}
}
