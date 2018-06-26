package com.MultiThread.Shutdown_Hook;

/*
 * JVM kapatilmadan �nce i�lem yapmak istiyorsaniz bu kod kullanilir
 * Program aniden kapama durumunda durumu kaydetmek i�in
 * G�nl�k kaydedimi
 * Temizleme i�lemleri
 * 
 * Jvm Nezaman Kapan�r:
 * komut ekran�nda ctrl+c 
 * system.exit(int); metodu �a�r�m�nda
 * oturum kapatmada
 * bilgisayari kapatmada
 * 
 * Runtime s�n�f�n�n addShutdownHook() metodu sanal makineye kay�t etmede kullan�l�r.
 * Runtime S�n�f�n� Runtime.getRuntime(); metoduyla elde ederiz statiktir.*/

class MyThread extends
		Thread {

	public void run() {

		System.out.println("shut down hook task completed..");
	}
}

public class App {

	public static void main(String[] args) throws Exception {

		// Kapatma ��lemi �a�r�m�
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new MyThread());

		System.out.println("Now main sleeping... press ctrl+c to exit");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
	}
}

// Same example of Shutdown Hook by annonymous class:
class TestShutdown2 {

	public static void main(String[] args) throws Exception {

		Runtime r = Runtime.getRuntime();

		r.addShutdownHook(new Thread() {

			public void run() {

				System.out.println("shut down hook task completed..");
			}
		});

		System.out.println("Now main sleeping... press ctrl+c to exit");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
	}
}