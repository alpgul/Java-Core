package com.MultiThread.Priority;

/**
 * public static int MIN_PRIORITY:1 de�erini
 * 
 * public static int NORM_PRIORITY:5 de�erini
 * 
 * public static int MAX_PRIORITY:10 de�erini al�r
 * 
 * Thread �nceli�i belirtmek i�in kullan�l�r
 * 
 * m1.setPriority(Thread.MIN_PRIORITY);// son
 * 
 * m2.setPriority(Thread.MAX_PRIORITY);// ilk
 */
class TestMultiPriority1 extends
		Thread {

	public void run() {

		System.out.println("running thread name is:" + Thread.currentThread().getName());
		System.out.println("running thread priority is:" + Thread.currentThread().getPriority());

	}

	public static void main(String args[]) {

		TestMultiPriority1 m1 = new TestMultiPriority1();
		TestMultiPriority1 m2 = new TestMultiPriority1();
		m1.setPriority(Thread.MIN_PRIORITY);// son
		m2.setPriority(Thread.MAX_PRIORITY);// ilk
		m1.start();
		m2.start();

	}
}