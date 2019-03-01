package com.soumyadeep.optional;

import java.util.Optional;

public class UsingOptionalfValuePresent {

	public static void main(String[] args) {

		String [] str = new String[20];
		System.out.println(str[5]);
		
		str[5] = "Value in str[5] is 4";
		
		Optional<String> result = Optional.ofNullable(str[5]);
		if(result.isPresent()) {
			String lowerCase = str[5].toLowerCase();
			System.out.println(lowerCase);
		} else {
			System.out.println("value not present");
		}
		
		
		
	}
}
