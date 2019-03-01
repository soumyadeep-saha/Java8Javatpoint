package com.soumyadeep.abstractClass;

abstract class AbstractClass {

	public AbstractClass() {
		System.out.println("i am in abstract constructor method");
	}
	
	abstract public void sayAbstract();
	
	static void sayAbstractStatic() {
		System.out.println("i am in sayAbstractStatic method");
	}
}
