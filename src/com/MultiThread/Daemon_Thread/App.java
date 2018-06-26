package com.MultiThread.Daemon_Thread;

/* Deamon Thread
 * Jvm ba�l�d�r.Ne zaman jvm olurse bu threadde olur.
 * 
 * Otomatik olarak �al��an bir�ok java daemon dizisi vard�r.  gc finalizer vb
 * 
 * Konsola jconsole  yazarak cal�san threadleri gorebilirsiniz.
 * */
public class App extends
		Thread {

	public void run() {

		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {

		App t1 = new App();// creating thread
		App t2 = new App();
		App t3 = new App();

		t1.setDaemon(true);// now t1 is daemon thread

		t1.start();// starting threads
		// t1.setDaemon(true); thread ba�lamadan once tan�mlan�r.
		// Output:exception in thread main: java.lang.IllegalThreadStateException
		t2.start();
		t3.start();
	}
}
