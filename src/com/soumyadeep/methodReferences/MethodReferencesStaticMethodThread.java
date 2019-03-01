package com.soumyadeep.methodReferences;

public class MethodReferencesStaticMethodThread {

	public static void printThread() {
		
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {

		Thread t1 = new Thread(MethodReferencesStaticMethodThread :: printThread);
		t1.start();
	}
}
