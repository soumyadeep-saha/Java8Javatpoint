package com.soumyadeep.abstractClass;

public class CallStatic {
	
	public void m1() {
		System.out.println("in m1");
	}
	static void m2() {
		System.out.println("in m2");
	}

	public static void main(String[] args) {

		CallStatic obj = new CallStatic();
		
		obj.m1();
		obj.m2();
		CallStatic.m2();
	}
}
