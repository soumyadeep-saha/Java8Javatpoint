package com.soumyadeep.recursion;

public class RecursionJavatpointFactorial {

	static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {

		int input = 9;
		int fact = factorial(input);
		System.out.println("Factorial is: " + fact);
	}
}
