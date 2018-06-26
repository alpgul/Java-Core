package com.MultiThread;

/* MultiThread Faydalar�:
 * 1.Engellenemez ��nk� ayn� anada ba��ms�z i� par�aca�� olarak �al���r
 * 2.Birlikte bir �ok i�lem ger�ekle�tirilir.B�ylece zaman kazanc� sa�lar.
 * 3.Di�er i� par�ac�klar�ndan ba��ms�z oldugundan sorun oldugundan etkilenmez.
 * 4.2 yolla olu�turulur.
 * */

//1.yol
public class App extends
		Thread {

	public void run() {

		System.out.println("thread is running...");
	}

	public static void main(String args[]) {

		App t1 = new App();
		t1.start();
	}
}

// 2.yol
class Multi3 implements
		Runnable {

	public void run() {

		System.out.println("thread is running...");
	}

	public static void main(String args[]) {

		Multi3 m1 = new Multi3();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}