package com.soumyadeep.optional;

import java.util.Optional;

public class UsingOptionalMethodReferrence {

	public static void main(String[] args) {

		String[] str = new String[20];
		
		str[4] = "Value at str[4] is 4";
		
		Optional<String> checkNull = Optional.ofNullable(str[4]);
		
		checkNull.ifPresent(System.out::println);
		System.out.println(checkNull.get());
		
		
	}
}
