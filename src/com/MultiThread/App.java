package com.MultiThread;

/* MultiThread Faydalarý:
 * 1.Engellenemez çünkü ayný anada baðýmsýz iþ parçacaðý olarak çalýþýr
 * 2.Birlikte bir çok iþlem gerçekleþtirilir.Böylece zaman kazancý saðlar.
 * 3.Diðer iþ parçacýklarýndan baðýmsýz oldugundan sorun oldugundan etkilenmez.
 * 4.2 yolla oluþturulur.
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