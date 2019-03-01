package com.soumyadeep.methodReferences;

public class MethodReferencesStaticMethodNormal {
	
	public static void saySomething() {
		
		System.out.println("My name is Soumyadeep");
	}

	public static void main(String[] args) {

		Sayable sayable = MethodReferencesStaticMethodNormal :: saySomething;
		
		sayable.say();
	}
}
