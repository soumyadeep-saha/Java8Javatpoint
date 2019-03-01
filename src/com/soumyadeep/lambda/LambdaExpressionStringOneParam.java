package com.soumyadeep.lambda;

public class LambdaExpressionStringOneParam {

	public static void main(String[] args) {

		// Lambda expression with single parameter.
		DrawableStringOneParam d1 = (name) -> {

			return "i am drawing with lambda string no param: " + name;
		};
		System.out.println(d1.draw("soumyadeep1"));

		// You can omit function parentheses
		DrawableStringOneParam d2 = name -> {
			String str = "i am drawing with lambda string no param: ";
			String str1 = str + name;
			return str1;
		};
		System.out.println(d2.draw("soumyadeep2"));
	}
}
