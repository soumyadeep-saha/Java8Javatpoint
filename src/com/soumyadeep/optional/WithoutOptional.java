package com.soumyadeep.optional;

public class WithoutOptional {

	public static void main(String[] args) {

		String [] str = new String[20];
		System.out.println(str[5]);
		
		String lowerCase = str[5].toLowerCase();
		System.out.println(lowerCase);
	}
}
