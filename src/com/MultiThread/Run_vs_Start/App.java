package com.MultiThread.Run_vs_Start;

/*
 * Start yerine run caðýrýrsak nolur?
 * Run caðýrýrsak bize thread gibi deðil obje olarak davranacaktýr thread olusmayacaktýr.*/
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

// Yukarýdaki programda görüldüðü gibi baðlam deðiþtirme yoktur çünkü burada t1
// ve t2 normal nesne olmayan nesne nesnesi olarak ele alýnacaktýr.