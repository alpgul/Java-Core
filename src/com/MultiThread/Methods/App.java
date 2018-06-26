package com.MultiThread.Methods;

public class App extends
		Thread {

	// bir iþ parcacýðýnýn eylem gercekleþtirmesi için kullanýlýr.
	public void run() {

		System.out.println("thread is running...");
	}

	public static void main(String args[]) {

		App t1 = new App();
		// iþ parçacýðýnýn eylemi yürütmesini saðlar run methodunu caðýrýr.
		t1.start();

		// iþ parçacýðýnýn belli süre uyumasýný saðlar.
		// t1.sleep(long ms);

		// iþ parçacýðýnýn yok olmasýný bekler.Belli süre beklemede olabilir.
		// t1.join();
		// t1.join(long ms);

		// Ýþ parcacýðý önceliðini dönderir.
		// t1.getPriority();

		// iþ parçacýðýnýn önceliðini deðiþtirir.
		// t1.setPriority(int priority)

		// Threadin adýný dönderir.
		// t1.getName();

		// threadin adýný deðiþtirir.
		// t1.setName(String name);

		// þu an çalýþan threadi dönderir.
		// t1.currentThread();

		// threadin idsini dönderir.
		// t1.getId();

		// iþ parçacýðýnýn durumunu döndürür.
		// t1.getState();

		// threadin canlý olup olmadýðýný kontrol eder.
		// t1.isAlive();

		// Çalýþan threadi duraklatýp diðer threadlerin calýsmasýný saglar.
		// t1.yield();

		// thread askýya alýr
		// t1.suspend();

		// askýya alýnan thread devam ettirir
		// t1.resume();

		// threadi durdurur.
		// t1.stop();

		// iþ parçacýðý bir daemon iþ parçacýðý olup olmadýðýný sýnar.
		// t1.isDaemon();

		// iþ parçacýðýný daemon veya kullanýcý iþ parçacýðý olarak iþaretler.
		/**
		 * Daemon Thread Ana threade baglýdýr ne zaman ana thread kapatýlýrsa daemon
		 * thread de kapatýlýr. User thread tamamen bagýmsýzdýr.
		 */
		// t1.setDaemon(boolean b);

		// Ýþ parçacýðýný keser
		// t1.interrupt();

		// iþ parçacýðý kesintiye uðradýysa test eder.
		// t1.isInterrupted();

		// Geçerli iþ parçacýðýnýn kesintiye uðradýðýný test eder.
		// t1.interrupted();

	}
}