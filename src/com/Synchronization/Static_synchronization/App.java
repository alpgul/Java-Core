package com.Synchronization.Static_synchronization;

/**
 * Static synchronization:
 * 
 * Static method synchronized yapýlýrsa kilit objede deðil sýnýfta olacaktýr.
 * 
 * Problem without static synchronization:
 * 
 * Eðer bir sýnýftan obj1 obj2 adýnda nesneler oluþturulduðunda threadler biri
 * obj1 diðeri obj 2 kullanýyorsa bu olayda kilitleme senkron olmaz ama static
 * senkronda sýnýf uzerinde olduðu için kilitlenme olacaktýr static senkron bu
 * olayý cozer
 */
// Example of static synchronization
class Table {

	// senkronizasyon sýnýf üzerindedir.
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
