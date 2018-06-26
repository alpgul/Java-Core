package com.Synchronization.Interrupting_Thread;

/**
 * Interrupting a Thread:
 * 
 * Herhangi bir iþ parçacýðý uyku veya bekleme durumundaysa iþ parçasýndaki
 * interrupt() yönteminin çaðrýlmasý uyku veya bekleme durumundan çýkarak
 * InterruptedException hatasý atar.Ýþ parçacýðý uyku veya bekleme durumunda
 * deðilse interrupt() yöntemini çaðýrmak normal davranýþý gerçekleþtirir ve iþ
 * parçacýðý kesmez ancak kesme iþaretini true olarak ayarlar.
 * 
 * 3 farklý yöntem vardýr:
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
			// Eðer durmasýný istemezsek try catch bloðunda hata fýrlatma yazmayýz
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
// Eðer iþ parçacýðý uyku veya bekleme durumunda deðilse, interrupt() yöntemi
// çaðrýldýðýnda iþ parçacýðý, daha sonra java programlayýcý tarafýndan iþ
// parçacýðý durdurmak için kullanýlabilen kesintili bayraðý ayarlar. Çalýþma
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
// IsInterrupted() yöntemi, kesintili bayraðý true veya false olarak
// döndürür. interrupted() yöntemi, eðer true ise false yapar.

class TestInterruptingThread4 extends
		Thread {

	public void run() {

		for (int i = 1; i <= 2; i++) {
			if (Thread.interrupted()) {
				// interrupt() metodu true yaptý Thread.interrupted() deðeri false tekrar
				// çevirdi.

				// if (this.isInterrupted()) {//kesintiyi kontrol eder true ise false çevrimi
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
		t1.interrupt();// kesinti oluþturuldu.

		t2.start();

	}
}