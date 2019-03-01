package com.soumyadeep.lambda;

public class LambdaExpressionVoid {
	
	public static void main(String[] args) {
		
		Drawable d1 = () -> {
			System.out.println("i am drawing with lambda void");
		};
		d1.draw();
		
		Drawable d2 = () -> {
			System.out.println("i am drawing again with lambda void");
		};
		d2.draw();
	}
}
