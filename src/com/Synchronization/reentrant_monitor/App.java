package com.Synchronization.reentrant_monitor;

/**
 * Reentrant Monitor:
 * 
 * Avantaj� tek threadin kilitlenmesini ortadan kald�r�r.
 * 
 * Baz� paralel programlama dilleri monit�r ad� verilen bir yap� sa�lar .
 * Monit�r �rt�l� olarak monit�r�n kapsam� i�inde tan�mlanan i�levler i�in kod
 * kilitleme yapar.
 * 
 * Java monitors are reentrant demek: E�er method method taraf�ndan �a�r�l�rsa
 * java i� par�ac��� ayn� monit�r� farkl� senkron metodlar i�in yeniden
 * kullanabilir.
 */
class Reentrant {

	public synchronized void n() {

		System.out.println("this is n() method");

	}

	public synchronized void m() {

		System.out.println("this is m() method" + "begin");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("this is m() method" + "end");
	}

}

// E�er Reentrant Monitor java desteklemeseydi method m kilitli oldu�u i�in
// method n ula��lam�yacakt� ��nk� ikisi ayn� nesneyi kulland���ndan method m
// kilidi kapat�lmad���ndan method n ba�lat�lmayacak method m kilidini
// kapat�lmas�n� bekliyecek method m de method n i�ilemi bitmedi�inden method n
// beklice boylece bir deadlock olusakt�r.
public class App {

	public static void main(String args[]) {

		final Reentrant re = new Reentrant();

		Thread t1 = new Thread() {

			public void run() {

				re.m();// calling method of Reentrant class
			}
		};
		t1.start();
		Thread t2 = new Thread() {

			public void run() {

				re.n();// calling method of Reentrant class
			}
		};
		t2.start();

	}
}