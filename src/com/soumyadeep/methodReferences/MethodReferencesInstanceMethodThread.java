package com.soumyadeep.methodReferences;

public class MethodReferencesInstanceMethodThread {

	public void printThread() {
		
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new MethodReferencesInstanceMethodThread() :: printThread);
		t1.start();
	}
}
