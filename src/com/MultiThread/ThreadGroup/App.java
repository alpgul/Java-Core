package com.MultiThread.ThreadGroup;

/*ThreadGroup
 * Birden �ok Thread nesnesini tek bir nesneden kontrol etmemize yarar durdurma kesme devam ettirme i�lemlerini tek noktadan yapabilir.
 * ThreadGroup(ThreadGroup parent, String name) // gruba ait �st grup ve isim tan�mlayabilir.
 * ThreadGroup(String name) // �st grup belirtmeksizin isim tan�mlayabilir.
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
		// bu grubun bilgilerini standart konsola yazd�r�r.
		tg1.list();

		// �al��an thread say�s� d�nd�r�r.
		System.out.println(tg1.activeCount());

		// Aktif gruba ba�l� grup say�s� g�sterilir.
		System.out.println(tg1.activeCount());

		// grup ad�n� d�nderir.
		System.out.println(tg1.getName());

		// �st ana grup threadi d�nderir. ThreadGroup getParent()
		// tg1.getParent();

		// gruba ait t�m threadleri yar�da keser
		// tg1.interrupt();

		// grup ve alt gruplar� yok eder.
		// tg1.destroy();
	}
}
