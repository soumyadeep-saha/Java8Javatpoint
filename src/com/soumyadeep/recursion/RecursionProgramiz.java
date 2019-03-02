package com.soumyadeep.recursion;

public class RecursionProgramiz {

	public static void main(String[] args) {

		int input = 9;
		int fact = factorial(input);
		System.out.println("Factorial is: " + fact);
	}

	static int factorial(int n) {
		if (n != 0) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}
}
