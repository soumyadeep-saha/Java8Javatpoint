package com.soumyadeep.abstractClass;

public class AbstractClassImplementation extends AbstractClass {

	/*
	 * After having default and static methods inside the interface, we think about
	 * the need of abstract class in Java. An interface and an abstract class is
	 * almost similar except that you can create constructor in the abstract class
	 * whereas you can't do this in interface.
	 */
	
	@Override
	public void sayAbstract() {

		System.out.println("i am in sayAbstract method");
	}
	
	private void m1() {
		System.out.println("i am in m1");
	}

	public static void m2() {
		System.out.println("i am in m2");
	}

	
	public static void main(String[] args) {
		
		AbstractClassImplementation object = new AbstractClassImplementation();
		object.sayAbstract();
		AbstractClass.sayAbstractStatic();
		object.m1();
		m2();
	}
}