package com.MultiThread.Methods;

public class App extends
		Thread {

	// bir i� parcac���n�n eylem gercekle�tirmesi i�in kullan�l�r.
	public void run() {

		System.out.println("thread is running...");
	}

	public static void main(String args[]) {

		App t1 = new App();
		// i� par�ac���n�n eylemi y�r�tmesini sa�lar run methodunu ca��r�r.
		t1.start();

		// i� par�ac���n�n belli s�re uyumas�n� sa�lar.
		// t1.sleep(long ms);

		// i� par�ac���n�n yok olmas�n� bekler.Belli s�re beklemede olabilir.
		// t1.join();
		// t1.join(long ms);

		// �� parcac��� �nceli�ini d�nderir.
		// t1.getPriority();

		// i� par�ac���n�n �nceli�ini de�i�tirir.
		// t1.setPriority(int priority)

		// Threadin ad�n� d�nderir.
		// t1.getName();

		// threadin ad�n� de�i�tirir.
		// t1.setName(String name);

		// �u an �al��an threadi d�nderir.
		// t1.currentThread();

		// threadin idsini d�nderir.
		// t1.getId();

		// i� par�ac���n�n durumunu d�nd�r�r.
		// t1.getState();

		// threadin canl� olup olmad���n� kontrol eder.
		// t1.isAlive();

		// �al��an threadi duraklat�p di�er threadlerin cal�smas�n� saglar.
		// t1.yield();

		// thread ask�ya al�r
		// t1.suspend();

		// ask�ya al�nan thread devam ettirir
		// t1.resume();

		// threadi durdurur.
		// t1.stop();

		// i� par�ac��� bir daemon i� par�ac��� olup olmad���n� s�nar.
		// t1.isDaemon();

		// i� par�ac���n� daemon veya kullan�c� i� par�ac��� olarak i�aretler.
		/**
		 * Daemon Thread Ana threade bagl�d�r ne zaman ana thread kapat�l�rsa daemon
		 * thread de kapat�l�r. User thread tamamen bag�ms�zd�r.
		 */
		// t1.setDaemon(boolean b);

		// �� par�ac���n� keser
		// t1.interrupt();

		// i� par�ac��� kesintiye u�rad�ysa test eder.
		// t1.isInterrupted();

		// Ge�erli i� par�ac���n�n kesintiye u�rad���n� test eder.
		// t1.interrupted();

	}
}