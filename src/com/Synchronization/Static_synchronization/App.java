package com.Synchronization.Static_synchronization;

/**
 * Static synchronization:
 * 
 * Static method synchronized yap�l�rsa kilit objede de�il s�n�fta olacakt�r.
 * 
 * Problem without static synchronization:
 * 
 * E�er bir s�n�ftan obj1 obj2 ad�nda nesneler olu�turuldu�unda threadler biri
 * obj1 di�eri obj 2 kullan�yorsa bu olayda kilitleme senkron olmaz ama static
 * senkronda s�n�f uzerinde oldu�u i�in kilitlenme olacakt�r static senkron bu
 * olay� cozer
 */
// Example of static synchronization
class Table {

	// senkronizasyon s�n�f �zerindedir.
	synchronized static void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}

}

class MyThread1 extends
		Thread {

	public void run() {

		Table.printTable(1);
	}
}

class MyThread2 extends
		Thread {

	public void run() {

		Table.printTable(10);
	}
}

class MyThread3 extends
		Thread {

	public void run() {

		Table.printTable(100);
	}
}

class MyThread4 extends
		Thread {

	public void run() {

		Table.printTable(1000);
	}
}

public class App {

	public static void main(String t[]) {

		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();
		MyThread4 t4 = new MyThread4();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

// Same example of static synchronization by annonymous class
class Table1 {

	synchronized static void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class TestSynchronization5 {

	public static void main(String[] args) {

		Thread t1 = new Thread() {

			public void run() {

				Table1.printTable(1);
			}
		};

		Thread t2 = new Thread() {

			public void run() {

				Table1.printTable(10);
			}
		};

		Thread t3 = new Thread() {

			public void run() {

				Table1.printTable(100);
			}
		};

		Thread t4 = new Thread() {

			public void run() {

				Table1.printTable(1000);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
