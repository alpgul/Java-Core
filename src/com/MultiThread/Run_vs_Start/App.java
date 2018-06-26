package com.MultiThread.Run_vs_Start;

/*
 * Start yerine run ca��r�rsak nolur?
 * Run ca��r�rsak bize thread gibi de�il obje olarak davranacakt�r thread olusmayacakt�r.*/
class TestCallRun1 extends
		Thread {

	public void run() {

		System.out.println("running...");
	}

	public static void main(String args[]) {

		TestCallRun1 t1 = new TestCallRun1();
		t1.run();// fine, but does not start a separate call stack
	}
}

class TestCallRun2 extends
		Thread {

	public void run() {

		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {

		TestCallRun2 t1 = new TestCallRun2();
		TestCallRun2 t2 = new TestCallRun2();

		t1.run();
		t2.run();
	}
}/**
	 * Output:1 2 3 4 5 1 2 3 4 5
	 * 
	 */

// Yukar�daki programda g�r�ld��� gibi ba�lam de�i�tirme yoktur ��nk� burada t1
// ve t2 normal nesne olmayan nesne nesnesi olarak ele al�nacakt�r.