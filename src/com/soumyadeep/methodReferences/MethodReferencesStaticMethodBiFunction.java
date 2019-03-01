package com.soumyadeep.methodReferences;

import java.util.function.BiFunction;

public class MethodReferencesStaticMethodBiFunction {
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static float add(int a, float b) {
		return a+b;
	}
	public static float add(float a, float b) {
		return a+b;
	}

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> add = MethodReferencesStaticMethodBiFunction :: add;
		
		BiFunction<Integer, Float, Float> addif = MethodReferencesStaticMethodBiFunction :: add;
		
		BiFunction<Float, Float, Float> addff = MethodReferencesStaticMethodBiFunction :: add;
		
		System.out.println(add.apply(4, 5));
		
		int result = add.apply(9, 9);
		
		System.out.println(result);
		
		System.out.println(add.apply(4, 5));
		System.out.println(addif.apply(4, 5.0f));
		System.out.println(addff.apply(4.0f, 5.0f));
		
		
	}
}
