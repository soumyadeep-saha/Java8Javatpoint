package com.soumyadeep.functionalInterface;

@FunctionalInterface
public interface Messagable{
	
	public void message();
	
	int hashCode();
	String toString();
	boolean equals(Object o);
	
	default void doIt() {
		System.out.println("default method do it now");
	}
}
