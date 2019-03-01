package com.soumyadeep.lambda;

public class LambdaExpressionStringParamReturnMultiple {

	public static void main(String[] args) {

		// Lambda expression with single parameter.
		DrawableStringOneParam d1 = (name) -> {
			
			String str = "My name is: "+name;
			return str;
		};
		System.out.println(d1.draw("Soumyadeep1"));
		
		// You can omit function parentheses
		DrawableStringOneParam d2 = name -> {
			String str = "My name is: ";
			String str1 = str + name;
			return str1;
		};
		System.out.println(d2.draw("Soumyadeep2"));
	}
}
