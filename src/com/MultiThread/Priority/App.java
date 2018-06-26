package com.MultiThread.Priority;

/**
 * public static int MIN_PRIORITY:1 deðerini
 * 
 * public static int NORM_PRIORITY:5 deðerini
 * 
 * public static int MAX_PRIORITY:10 deðerini alýr
 * 
 * Thread Önceliði belirtmek için kullanýlýr
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