package com.soumyadeep.methodReferences;

public class MethodReferencesConstructorMethodNormal {
	
	public MethodReferencesConstructorMethodNormal() {
		
		System.out.println("My name is Soumyadeep");
	}

	public static void main(String[] args) {

		 // Referring non-static method using anonymous object  
		Sayable sayable = MethodReferencesConstructorMethodNormal :: new;
		sayable.say();
	}
}
