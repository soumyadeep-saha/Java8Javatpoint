package com.soumyadeep.lambda;

public class LambdaExpressionCreatingThread {

	public static void main(String[] args) {

		//Thread Example without lambda
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread name: " + Thread.currentThread().getName());
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		//Thread Example with lambda
		Runnable r2 = () -> {
			System.out.println("Thread name: " + Thread.currentThread().getName());
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
	}
}
