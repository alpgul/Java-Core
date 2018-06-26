package com.Synchronization.Deadlock;

/**
 * Deadlock:
 * 
 * Java'daki kilitlenme çoklu iþ parçasýnýn bir parçasýdýr. Kilitlenme bir iþ
 * parçacýðýnýn bir nesne kilidini beklediði baþka bir iþ parçacýðý tarafýndan
 * elde edildiði ve ikinci iþ parçacýðýnýn ilk iþ parçacýðý tarafýndan alýnan
 * bir nesne kilidinin beklendiði bir durumda ortaya çýkabilir. Her iki iplik de
 * kilidi serbest býrakmak için birbirlerini beklediðinden duruma kilitlenme
 * denir.
 */
// Example of Deadlock in java
// Bu örnekte t1 thread resource1 senkronuna giriyor.
// t2 threadide resource2 senkronuna giriyor. t1 threadi resource1 senkronun
// içindeki resource2 geldiðinde t2 tarfýndan kullanýldýðý için t2 bitmesini
// bekliyor fakat t2 de resource2 içindeki resource1 senkronunu kodunu
// iþleyemiyor oda t1 içindeki resource1 senkronun bitmesini beklitor bu yüzden
// ikiside beklemeye alýyor buna Deadlock denir.

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