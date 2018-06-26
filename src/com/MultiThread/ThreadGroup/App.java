package com.MultiThread.ThreadGroup;

/*ThreadGroup
 * Birden çok Thread nesnesini tek bir nesneden kontrol etmemize yarar durdurma kesme devam ettirme iþlemlerini tek noktadan yapabilir.
 * ThreadGroup(ThreadGroup parent, String name) // gruba ait üst grup ve isim tanýmlayabilir.
 * ThreadGroup(String name) // üst grup belirtmeksizin isim tanýmlayabilir.
 * */
public class App implements
		Runnable {

	public void run() {

		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		App runnable = new App();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(tg1, runnable, "one");
		t1.start();
		Thread t2 = new Thread(tg1, runnable, "two");
		t2.start();
		Thread t3 = new Thread(tg1, runnable, "three");
		t3.start();
		System.out.println("Thread Group Name: " + tg1.getName());
		// bu grubun bilgilerini standart konsola yazdýrýr.
		tg1.list();

		// Çalýþan thread sayýsý döndürür.
		System.out.println(tg1.activeCount());

		// Aktif gruba baðlý grup sayýsý gösterilir.
		System.out.println(tg1.activeCount());

		// grup adýný dönderir.
		System.out.println(tg1.getName());

		// üst ana grup threadi dönderir. ThreadGroup getParent()
		// tg1.getParent();

		// gruba ait tüm threadleri yarýda keser
		// tg1.interrupt();

		// grup ve alt gruplarý yok eder.
		// tg1.destroy();
	}
}
