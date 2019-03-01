package com.soumyadeep.lambda;

public class WithoutLambdaExpression {

	public static void main(String[] args) {
		
		Drawable d1 = new Drawable() {
			@Override
			public void draw() {
				System.out.println("i am drawing without lambda");
			}
		};
		d1.draw();
	}
}
