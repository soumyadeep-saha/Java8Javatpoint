package com.soumyadeep.staticMethods;

public class SayableStaticImplementation implements SayableStatic {

	/*
	 * You can also define static methods inside the interface. Static methods are
	 * used to define utility methods.
	 */
	
	@Override
	public void sayAbstract() {

		System.out.println("i am in abstract method");
	}

	public static void main(String[] args) {

		SayableStatic.sayStatic();
		SayableStaticImplementation object = new SayableStaticImplementation();
		object.sayAbstract();
		object.sayDefault();
	}
}
