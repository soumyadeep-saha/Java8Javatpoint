package com.soumyadeep.defaultMethods;

public class SayableDefaultImplementation implements SayableDefault {

	/*
	 * Java provides a facility to create default methods inside the interface.
	 * Methods which are defined inside the interface and tagged with default are
	 * known as default methods. These methods are non-abstract methods.
	 */
	
	@Override
	public void sayAbstract() {

		System.out.println("i am in abstract method");
	}

	public static void main(String[] args) {

		SayableDefaultImplementation obj = new SayableDefaultImplementation();
		obj.sayAbstract();
		obj.sayDefault();
	}
}
