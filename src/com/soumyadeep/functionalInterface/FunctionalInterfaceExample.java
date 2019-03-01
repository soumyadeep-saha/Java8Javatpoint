package com.soumyadeep.functionalInterface;

public class FunctionalInterfaceExample implements Sayable{

	@Override
	public void say(){
		System.out.println("say method in functional interface");
	}
	public static void main(String[] args) {
		
		FunctionalInterfaceExample functionalInterfaceExample = new FunctionalInterfaceExample();
		functionalInterfaceExample.say();
	}
}
