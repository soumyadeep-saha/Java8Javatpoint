package com.soumyadeep.methodReferences;

public class MethodReferencesInstanceMethodNormal {
	
	public void saySomething() {
		
		System.out.println("My name is Soumyadeep");
	}

	public static void main(String[] args) {

		 // Referring non-static method using anonymous object  
		Sayable sayable = new MethodReferencesInstanceMethodNormal() :: saySomething;
		sayable.say();
		
		
		// Referring non-static method using reference 
		MethodReferencesInstanceMethodNormal obj = new MethodReferencesInstanceMethodNormal();
		Sayable sayable1 = obj :: saySomething;
		sayable1.say();
	}
}
