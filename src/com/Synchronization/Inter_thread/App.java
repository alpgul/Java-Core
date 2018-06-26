package com.Synchronization.Inter_thread;

/**
 * Inter-thread communication :
 *
 * Inter-thread iletiþim veya iþbirliði senkronize iþ parçacýklarýnýn
 * birbirleriyle iletiþim kurmasýna izin vermekle ilgilidir.
 * 
 * Ýþbirliði (Inter-thread iletiþim) bir iþ parçacýðýnýn kritik bölümünde
 * çalýþmasýnýn durdurulduðu bir mekanizmadýr ve baþka bir iþ parçacýðýnýn
 * yürütülecek ayný kritik bölüme girmesine (veya kilitlenmesine) izin verilir.
 * Bu Object sýnýfýnýn aþaðýdaki yöntemleriyle uygulanýr.
 * <li>wait()</li>
 * <li>notify()</li>
 * <li>notifyAll()</li>
 */
// 1) wait() method
// Wait metodu çalýþan threadi beklemeye alýr eðer thread senkron bloktaysa
// oradan çýkacaktýr baþka bir threadin eriþimine izin verilecektir.Belli bir
// süre veya notify() ve notifyAll() ile thread uyandýrýlýr kaldýðý yerden
// devamý saðlanabilir. wait(long timeout) or wait()

// 2) notify() method
// Bu nesnenin monitöründe bekleyen tek bir iþ parçacýðý uyanýr. Bu nesne
// üzerinde herhangi bir iplik bekliyorsa bunlardan biri uyandýrýlmak üzere
// seçilir. Seçim keyfi ve JVM takdirine baðlý olarak gerçekleþir.

// 3) notifyAll() method
// Bu nesnenin monitöründe bekleyen tüm konularý uyandýrýr.
class Customer {

	int amount = 10000;

	synchronized void withdraw(int amount) {

		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				// sleep(1000) lockdan cýkýlmýyýcak belirtilen süre boyunca diðer thread
				// beklenilecektir.
				wait();// lockdan cýkýldý ve beklemeye alýndý
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {

		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();// beklemede olan herhangi bir thread uyandýrýldý.
	}
}

public class App {

	public static void main(String args[]) {

		final Customer c = new Customer();
		new Thread() {

			public void run() {

				c.withdraw(15000);
			}
		}.start();
		new Thread() {

			public void run() {

				c.deposit(10000);
			}
		}.start();

	}
}