package com.MultiThread.Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Java Ýþ parçacýðý havuzu iþi bekleyen ve birçok kez yeniden kullanan bir grup
 * iþ parçacýðýný temsil eder.
 * 
 * Ýþ parçacýðý havuzu durumunda bir grup sabit boyutlu iþ parçacýðý
 * oluþturulur.
 * 
 * Ýþ parçacýðý havuzundan bir iþ parçacýðý dýþarý çekilir ve servis saðlayýcý
 * tarafýndan bir iþ atanýr.
 * 
 * Ýþin tamamlanmasýndan sonra iþ parçacýðý tekrar iþ parçacýðý havuzunda
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
 * Geri Future nesnesi dönderir bu iþlem runnable iþlemin bitip bitmediðini anlamaya yarayabilir.
 * 
 * Future future= executorService.submit(new Callable(){
 * Geri deðer döndürür. future.get() ile deðeri çekeriz.
 * 
 *  executorService.invokeAny(callables)
 * geri callable listesinden birin deðerini dönderir hangisinin döndüðünü bilemeyiz.
 * 
 * executorService.invokeAll(callables);
 * Future listesi döndürür tüm callarin
 * 
 * */
		// Runtime.getRuntime().availableProcessors() bilgisayardaki cekirdek sayýsýný
		// belirtir cekirdek sayýsý kadar thread olusturuldu
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		// creating a pool of count of cores threads
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("" + i);
			// bu 5 thread eylemi calistirmasi icin öncelik sýrasýna gore cagrilmasi ve
			// gorev atamasý yapýldý.
			executor.execute(worker);// calling execute method of ExecutorService
		}
		// 5 adetten olusan thread havuzu kapatma islemi yollandý. tüm threadler gorevi
		// bitiminden sonra kapatma gerceklesek
		executor.shutdown();
		while (!executor.isTerminated()) {// kapatmayi bekleme
		}

		System.out.println("Finished all threads");
	}
}