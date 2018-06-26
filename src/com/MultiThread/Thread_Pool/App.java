package com.MultiThread.Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Java �� par�ac��� havuzu i�i bekleyen ve bir�ok kez yeniden kullanan bir grup
 * i� par�ac���n� temsil eder.
 * 
 * �� par�ac��� havuzu durumunda bir grup sabit boyutlu i� par�ac���
 * olu�turulur.
 * 
 * �� par�ac��� havuzundan bir i� par�ac��� d��ar� �ekilir ve servis sa�lay�c�
 * taraf�ndan bir i� atan�r.
 * 
 * ��in tamamlanmas�ndan sonra i� par�ac��� tekrar i� par�ac��� havuzunda
 * bulunur.
 */
class WorkerThread implements
		Runnable {

	private String message;

	public WorkerThread(String s) {

		this.message = s;
	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		processmessage();// call processmessage method that sleeps the thread for 2 seconds
		System.out.println(Thread.currentThread().getName() + " (End)");// prints thread name
	}

	private void processmessage() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class App {

	public static void main(String[] args) {

/*
 * Future future= executorService.submit(new Runnable() {
 * Geri Future nesnesi d�nderir bu i�lem runnable i�lemin bitip bitmedi�ini anlamaya yarayabilir.
 * 
 * Future future= executorService.submit(new Callable(){
 * Geri de�er d�nd�r�r. future.get() ile de�eri �ekeriz.
 * 
 *  executorService.invokeAny(callables)
 * geri callable listesinden birin de�erini d�nderir hangisinin d�nd���n� bilemeyiz.
 * 
 * executorService.invokeAll(callables);
 * Future listesi d�nd�r�r t�m callarin
 * 
 * */
		// Runtime.getRuntime().availableProcessors() bilgisayardaki cekirdek say�s�n�
		// belirtir cekirdek say�s� kadar thread olusturuldu
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		// creating a pool of count of cores threads
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("" + i);
			// bu 5 thread eylemi calistirmasi icin �ncelik s�ras�na gore cagrilmasi ve
			// gorev atamas� yap�ld�.
			executor.execute(worker);// calling execute method of ExecutorService
		}
		// 5 adetten olusan thread havuzu kapatma islemi yolland�. t�m threadler gorevi
		// bitiminden sonra kapatma gerceklesek
		executor.shutdown();
		while (!executor.isTerminated()) {// kapatmayi bekleme
		}

		System.out.println("Finished all threads");
	}
}