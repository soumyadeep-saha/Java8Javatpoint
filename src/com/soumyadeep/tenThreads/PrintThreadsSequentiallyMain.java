package com.soumyadeep.tenThreads;
public class PrintThreadsSequentiallyMain {
 
	public static void main(String[] args) {
		
		PrintSequenceRunnable runnable1=new PrintSequenceRunnable(1);
		PrintSequenceRunnable runnable2=new PrintSequenceRunnable(2);
		PrintSequenceRunnable runnable3=new PrintSequenceRunnable(3);
		PrintSequenceRunnable runnable4=new PrintSequenceRunnable(4);
		PrintSequenceRunnable runnable5=new PrintSequenceRunnable(5);
		PrintSequenceRunnable runnable6=new PrintSequenceRunnable(6);
		PrintSequenceRunnable runnable7=new PrintSequenceRunnable(7);
		PrintSequenceRunnable runnable8=new PrintSequenceRunnable(8);
		PrintSequenceRunnable runnable9=new PrintSequenceRunnable(9);
		PrintSequenceRunnable runnable10=new PrintSequenceRunnable(0);
		
		
		Thread t1=new Thread(runnable1,"T1");
		Thread t2=new Thread(runnable2,"T2");
		Thread t3=new Thread(runnable3,"T3");
		Thread t4=new Thread(runnable4,"T4");
		Thread t5=new Thread(runnable5,"T5");
		Thread t6=new Thread(runnable6,"T6");
		Thread t7=new Thread(runnable7,"T7");
		Thread t8=new Thread(runnable8,"T8");
		Thread t9=new Thread(runnable9,"T9");
		Thread t10=new Thread(runnable10,"T10");
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();	 
		t5.start();	 
		t6.start();	 
		t7.start();	 
		t8.start();	 
		t9.start();	 
		t10.start();	 
	}
}
