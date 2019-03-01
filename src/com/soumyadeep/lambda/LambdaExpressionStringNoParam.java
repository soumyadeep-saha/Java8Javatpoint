package com.soumyadeep.lambda;

public class LambdaExpressionStringNoParam {

	public static void main(String[] args) {

		DrawableStringNoParam d1 = () -> {
			
			return "i am drawing with lambda string no param";
		};
		System.out.println(d1.draw());
	}
}
