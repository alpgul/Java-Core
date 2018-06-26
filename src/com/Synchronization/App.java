package com.Synchronization;

/**
 * Java'da Senkronizasyon
 * 
 * Java Senkronizasyonu, paylaþýlan kaynaða yalnýzca bir iþ parçacýðýnýn
 * eriþmesine izin vermek istediðimiz daha iyi bir seçenektir.
 * 
 * Ýki tür senkronizasyon var:
 * <li>1.Process Synchronization</li>
 * <li>2.Thread Synchronization</li>
 * 
 * Thread Synchronization:
 * <li>1.Mutual Exclusive</li>
 * <li>1.1.Synchronized method.</li>
 * <li>1.2.Synchronized block.</li>
 * <li>1.3.static synchronization.</li>
 * <li>2.Cooperation (Javada Thread arasý iletim)</li>
 * 
 * 
 */

// Understanding the problem without Synchronization
// PrintTable methoduna 2 Thread eriþiyor 1. Thread iþelemi bitmeden diðer
// Thread de eriþiyor. Bu ortak kaynak kullanýmýnda sorun yaratacaktýr.
class Table {

	void printTable(int n) {// method not synchronized

		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread1 extends
		Thread {

	Table t;

	MyThread1(Table t) {

		this.t = t;
	}

	public void run() {

		t.printTable(5);
	}

}

class MyThread2 extends
		Thread {

	Table t;

	MyThread2(Table t) {

		this.t = t;
	}

	public void run() {

		t.printTable(100);
	}
}

public class App {

	public static void main(String args[]) {

		Table obj = new Table();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}

// Java synchronized method
// printtable1 metoduna sadece 1 thread eriþecek bu eriþim süresi boyunca baþka
// bir thread eriþemiyecek buda ortak kaynak kullanýmda karmaþayý ortadan
// kaldýracaktýr.
class Table1 {

	synchronized void printTable1(int n) {// synchronized method

		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread4 extends
		Thread {

	Table1 t;

	MyThread4(Table1 t) {

		this.t = t;
	}

	public void run() {

		t.printTable1(5);
	}

}

class MyThread3 extends
		Thread {

	Table1 t;

	MyThread3(Table1 t) {

		this.t = t;
	}

	public void run() {

		t.printTable1(100);
	}
}

class TestSynchronization2 {

	public static void main(String args[]) {

		Table1 obj = new Table1();// only one object
		MyThread4 t1 = new MyThread4(obj);
		MyThread3 t2 = new MyThread3(obj);
		t1.start();
		t2.start();
	}
}

// Program of synchronized method by using annonymous class
class Table2 {

	synchronized void printTable(int n) {// synchronized method

		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class TestSynchronization3 {

	public static void main(String args[]) {

		final Table2 obj = new Table2();// only one object

		Thread t1 = new Thread() {

			public void run() {

				obj.printTable(5);
			}
		};
		Thread t2 = new Thread() {

			public void run() {

				obj.printTable(100);
			}
		};

		t1.start();
		t2.start();
	}
}