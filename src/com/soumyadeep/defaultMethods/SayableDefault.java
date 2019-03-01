package com.soumyadeep.defaultMethods;

interface SayableDefault {
	
	public void sayAbstract();
	
	public default void sayDefault() {
		System.out.println("i am in default method");
	}
}
