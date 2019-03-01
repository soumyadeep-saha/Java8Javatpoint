package com.soumyadeep.functionalInterface;

public class FunctionalInterfaceObjectClass implements Messagable{

	@Override
	public void message(){
		System.out.println("message method in functional interface along with object methods");
	}
	public static void main(String[] args) {
		
		FunctionalInterfaceObjectClass functionalInterfaceExample = new FunctionalInterfaceObjectClass();
		functionalInterfaceExample.message();
		functionalInterfaceExample.doIt();
	}
}
