package com.MultiThread.Shutdown_Hook;

/*
 * JVM kapatilmadan önce iþlem yapmak istiyorsaniz bu kod kullanilir
 * Program aniden kapama durumunda durumu kaydetmek için
 * Günlük kaydedimi
 * Temizleme iþlemleri
 * 
 * Jvm Nezaman Kapanýr:
 * komut ekranýnda ctrl+c 
 * system.exit(int); metodu çaðrýmýnda
 * oturum kapatmada
 * bilgisayari kapatmada
 * 
 * Runtime sýnýfýnýn addShutdownHook() metodu sanal makineye kayýt etmede kullanýlýr.
 * Runtime Sýnýfýný Runtime.getRuntime(); metoduyla elde ederiz statiktir.*/

class MyThread extends
		Thread {

	public void run() {

		System.out.println("shut down hook task completed..");
	}
}

public class App {

	public static void main(String[] args) throws Exception {

		// Kapatma Ýþlemi çaðrýmý
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