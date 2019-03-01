package com.soumyadeep.staticMethods;

interface SayableStatic {
	
	default void sayDefault() {
		System.out.println("i am in default method");
	}
	
	public void sayAbstract();
	
	static void sayStatic() {
		System.out.println("i am in static method");
	}
}
