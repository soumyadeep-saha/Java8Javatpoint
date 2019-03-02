package com.soumyadeep.recursion;

public class RecursionJavatpointFibonacci {

	/*
	 * Recursion in java is a process in which a method calls itself continuously. A
	 * method in java that calls itself is called recursive method.
	 */
	
	public static void main(String[] args) {

		int count = 20;
		System.out.print("0 1");
		fibo(count - 2);
	}

	static int i1 = 0;
	static int i2 = 1;
	static int i3 = 0;

	private static void fibo(int count) {

		if (count > 0) {
			i3 = i1 + i2;
			i1 = i2;
			i2 = i3;
			System.out.print(" " + i3);
			fibo(count - 1);
		}
	}
}
