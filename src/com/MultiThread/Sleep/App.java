package com.MultiThread.Sleep;

public class App extends
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

		App t1 = new App();
		App t2 = new App();

		t1.start();
		t2.start();
	}
}
