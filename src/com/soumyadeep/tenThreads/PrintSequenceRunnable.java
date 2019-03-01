package com.soumyadeep.tenThreads;
public class PrintSequenceRunnable implements Runnable{
 
	public int PRINT_NUMBERS_UPTO=100;
	static int  number=1;
	int remainder;
	//static Object lock=new Object();
 
	PrintSequenceRunnable(int remainder)
	{
		this.remainder=remainder;
	}
 
	@Override
	public void run() {
		while (number <= PRINT_NUMBERS_UPTO-9) {
			synchronized (this) {
				while (number % 10 != remainder) { // wait for numbers other than remainder
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				this.notifyAll();
			}
		}
	}
}
