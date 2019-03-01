package com.soumyadeep.lambda;

public class LambdaExpressionString2Param {

	public static void main(String[] args) {

		/*
		 * In Java lambda expression, if there is only one statement, you may or may not
		 * use return keyword. You must use return keyword when lambda expression
		 * contains multiple statements.
		 */
		
		// Multiple parameters in lambda expression
		// Lambda expression without return keyword.
		Addable a1 = (a, b) -> (a + b);
		System.out.println("Addition is " + a1.add(9, 9));

		// Multiple parameters with data type in lambda expression
		// Lambda expression without return keyword.
		Addable a2 = (int a, int b) -> (a + b);
		System.out.println("Addition is " + a2.add(8, 1));

		// Lambda expression with two parameter.
		// Lambda expression with return keyword.
		Addable a3 = (a, b) -> {
			return (a + b);
		};
		System.out.println("Addition is " + a3.add(4, 5));

		// Multiple parameters with data type in lambda expression
		// Lambda expression with return keyword.
		Addable a4 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println("Addition is " + a4.add(9, 2));
	}
}
