package com.Synchronization.Inter_thread;

/**
 * Inter-thread communication :
 *
 * Inter-thread ileti�im veya i�birli�i senkronize i� par�ac�klar�n�n
 * birbirleriyle ileti�im kurmas�na izin vermekle ilgilidir.
 * 
 * ��birli�i (Inter-thread ileti�im) bir i� par�ac���n�n kritik b�l�m�nde
 * �al��mas�n�n durduruldu�u bir mekanizmad�r ve ba�ka bir i� par�ac���n�n
 * y�r�t�lecek ayn� kritik b�l�me girmesine (veya kilitlenmesine) izin verilir.
 * Bu Object s�n�f�n�n a�a��daki y�ntemleriyle uygulan�r.
 * <li>wait()</li>
 * <li>notify()</li>
 * <li>notifyAll()</li>
 */
// 1) wait() method
// Wait metodu �al��an threadi beklemeye al�r e�er thread senkron bloktaysa
// oradan ��kacakt�r ba�ka bir threadin eri�imine izin verilecektir.Belli bir
// s�re veya notify() ve notifyAll() ile thread uyand�r�l�r kald��� yerden
// devam� sa�lanabilir. wait(long timeout) or wait()

// 2) notify() method
// Bu nesnenin monit�r�nde bekleyen tek bir i� par�ac��� uyan�r. Bu nesne
// �zerinde herhangi bir iplik bekliyorsa bunlardan biri uyand�r�lmak �zere
// se�ilir. Se�im keyfi ve JVM takdirine ba�l� olarak ger�ekle�ir.

// 3) notifyAll() method
// Bu nesnenin monit�r�nde bekleyen t�m konular� uyand�r�r.
class Customer {

	int amount = 10000;

	synchronized void withdraw(int amount) {

		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				// sleep(1000) lockdan c�k�lm�y�cak belirtilen s�re boyunca di�er thread
				// beklenilecektir.
				wait();// lockdan c�k�ld� ve beklemeye al�nd�
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
		notify();// beklemede olan herhangi bir thread uyand�r�ld�.
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