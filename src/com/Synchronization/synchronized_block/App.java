package com.Synchronization.synchronized_block;

/**
 * Java'da senkronize blok:
 * 
 * Y�nteminizde 50 sat�r kodunuz oldu�unu varsayal�m, ancak sadece 5 sat�r�
 * senkronize etmek istiyorsan�z senkronize edilmi� blo�u kullanabilirsiniz.
 * 
 * 1.Senkronize blok, herhangi bir payla��lan kaynak i�in bir nesneyi kilitlemek
 * i�in kullan�l�r.
 * 
 * 2.Senkronize blo�un kapsam�, y�ntemden daha k���kt�r.
 */

// Senkronize blok �rne�i
class Table {

	void printTable(int n) {

		// Bu senkron kod blo�una girildi�inde giren thread d���ndakiler beklemeye
		// gececek ne zaman senkron blokdan c�kt�g�m�zda di�er threadler teker teker
		// senkron blo�a girecekler.synchronized ald��� paramatre This kilitlenecek
		// nesneyi g�sterir.
		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}// end of the method
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

// Program of synchronized block by using annonymous class
class Table1 {

	void printTable(int n) {

		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}// end of the method
}

class TestSynchronizedBlock2 {

	public static void main(String args[]) {

		final Table1 obj = new Table1();// only one object

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