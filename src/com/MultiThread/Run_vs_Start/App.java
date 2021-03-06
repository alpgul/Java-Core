package com.MultiThread.Run_vs_Start;

/*
 * Start yerine run cağırırsak nolur?
 * Run cağırırsak bize thread gibi değil obje olarak davranacaktır thread olusmayacaktır.*/
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

// Yukarıdaki programda görüldüğü gibi bağlam değiştirme yoktur çünkü burada t1
// ve t2 normal nesne olmayan nesne nesnesi olarak ele alınacaktır.