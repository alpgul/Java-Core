package com.MultiThread.Twice_Thread;

public class App extends
		Thread {

	public void run() {

		System.out.println("running...");
	}

	public static void main(String args[]) {

		App t1 = new App();
		t1.start();
		// Ayný threadi 2 çaðýramayýz.
		t1.start();// Exception in thread "main" java.lang.IllegalThreadStateException
	}
}