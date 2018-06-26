package com.Synchronization.Interrupting_Thread;

/**
 * Interrupting a Thread:
 * 
 * Herhangi bir i� par�ac��� uyku veya bekleme durumundaysa i� par�as�ndaki
 * interrupt() y�nteminin �a�r�lmas� uyku veya bekleme durumundan ��karak
 * InterruptedException hatas� atar.�� par�ac��� uyku veya bekleme durumunda
 * de�ilse interrupt() y�ntemini �a��rmak normal davran��� ger�ekle�tirir ve i�
 * par�ac��� kesmez ancak kesme i�aretini true olarak ayarlar.
 * 
 * 3 farkl� y�ntem vard�r:
 * 
 * <li>public void interrupt()
 * <li>public static boolean interrupted()
 * <li>public boolean isInterrupted()
 */

// Example of interrupting a thread that stops working
public class App extends
		Thread {

	public void run() {

		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			// E�er durmas�n� istemezsek try catch blo�unda hata f�rlatma yazmay�z
			// alabiliriz.
			System.out.println("Exception handled " + e);
			// throw new RuntimeException("Thread interrupted..." + e);
		}
		System.out.println("thread is running...");

	}

	public static void main(String args[]) {

		App t1 = new App();
		t1.start();
		try {
			t1.interrupt();
		} catch (Exception e) {
			System.out.println("Exception handled " + e);
		}

	}
}

// Example of interrupting a thread that doesn't stop working
class TestInterruptingThread2 extends
		Thread {

	public void run() {

		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			System.out.println("Exception handled " + e);
		}
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {

		TestInterruptingThread2 t1 = new TestInterruptingThread2();
		t1.start();

		t1.interrupt();

	}
}

// Example of interrupting thread that behaves normally
// E�er i� par�ac��� uyku veya bekleme durumunda de�ilse, interrupt() y�ntemi
// �a�r�ld���nda i� par�ac���, daha sonra java programlay�c� taraf�ndan i�
// par�ac��� durdurmak i�in kullan�labilen kesintili bayra�� ayarlar. �al��ma
// normal devam eder.
class TestInterruptingThread3 extends
		Thread {

	public void run() {

		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String args[]) {

		TestInterruptingThread3 t1 = new TestInterruptingThread3();
		t1.start();

		t1.interrupt();

	}
}

// What about isInterrupted and interrupted method?
// IsInterrupted() y�ntemi, kesintili bayra�� true veya false olarak
// d�nd�r�r. interrupted() y�ntemi, e�er true ise false yapar.

class TestInterruptingThread4 extends
		Thread {

	public void run() {

		for (int i = 1; i <= 2; i++) {
			if (Thread.interrupted()) {
				// interrupt() metodu true yapt� Thread.interrupted() de�eri false tekrar
				// �evirdi.

				// if (this.isInterrupted()) {//kesintiyi kontrol eder true ise false �evrimi
				// yapmaz.

				System.out.println("code for interrupted thread");
			} else {
				System.out.println("code for normal thread");
			}

		}// end of for loop
	}

	public static void main(String args[]) {

		TestInterruptingThread4 t1 = new TestInterruptingThread4();
		TestInterruptingThread4 t2 = new TestInterruptingThread4();

		t1.start();
		t1.interrupt();// kesinti olu�turuldu.

		t2.start();

	}
}