package com.soumyadeep.optional;

import java.util.Optional;

public class UsingOptional {

	public static void main(String[] args) {

		String [] str = new String[20];
		System.out.println(str[5]);
		
		Optional<String> result = Optional.ofNullable(str[5]);
		if(result.isPresent()) {
			String lowerCase = str[5].toLowerCase();
			System.out.println(lowerCase);
		} else {
			System.out.println("value not present");
		}
		
		
		
	}
}
