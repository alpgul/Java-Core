package com.Synchronization.Deadlock;

/**
 * Deadlock:
 * 
 * Java'daki kilitlenme �oklu i� par�as�n�n bir par�as�d�r. Kilitlenme bir i�
 * par�ac���n�n bir nesne kilidini bekledi�i ba�ka bir i� par�ac��� taraf�ndan
 * elde edildi�i ve ikinci i� par�ac���n�n ilk i� par�ac��� taraf�ndan al�nan
 * bir nesne kilidinin beklendi�i bir durumda ortaya ��kabilir. Her iki iplik de
 * kilidi serbest b�rakmak i�in birbirlerini bekledi�inden duruma kilitlenme
 * denir.
 */
// Example of Deadlock in java
// Bu �rnekte t1 thread resource1 senkronuna giriyor.
// t2 threadide resource2 senkronuna giriyor. t1 threadi resource1 senkronun
// i�indeki resource2 geldi�inde t2 tarf�ndan kullan�ld��� i�in t2 bitmesini
// bekliyor fakat t2 de resource2 i�indeki resource1 senkronunu kodunu
// i�leyemiyor oda t1 i�indeki resource1 senkronun bitmesini beklitor bu y�zden
// ikiside beklemeye al�yor buna Deadlock denir.

public class App {

	public static void main(String[] args) {

		final String resource1 = "ratan jaiswal";
		final String resource2 = "vimal jaiswal";
		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {

			public void run() {

				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
					// waiting t2 thread
					synchronized (resource2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};

		// t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {

			public void run() {

				synchronized (resource2) {
					System.out.println("Thread 2: locked resource 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
					// waiting t1 thread
					synchronized (resource1) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}