package com.Synchronization.reentrant_monitor;

/**
 * Reentrant Monitor:
 * 
 * Avantajý tek threadin kilitlenmesini ortadan kaldýrýr.
 * 
 * Bazý paralel programlama dilleri monitör adý verilen bir yapý saðlar .
 * Monitör örtülü olarak monitörün kapsamý içinde tanýmlanan iþlevler için kod
 * kilitleme yapar.
 * 
 * Java monitors are reentrant demek: Eðer method method tarafýndan çaðrýlýrsa
 * java iþ parçacýðý ayný monitörü farklý senkron metodlar için yeniden
 * kullanabilir.
 */
class Reentrant {

	public synchronized void n() {

		System.out.println("this is n() method");

	}

	public synchronized void m() {

		System.out.println("this is m() method" + "begin");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("this is m() method" + "end");
	}

}

// Eðer Reentrant Monitor java desteklemeseydi method m kilitli olduðu için
// method n ulaþýlamýyacaktý çünkü ikisi ayný nesneyi kullandýðýndan method m
// kilidi kapatýlmadýðýndan method n baþlatýlmayacak method m kilidini
// kapatýlmasýný bekliyecek method m de method n iþilemi bitmediðinden method n
// beklice boylece bir deadlock olusaktýr.
public class App {

	public static void main(String args[]) {

		final Reentrant re = new Reentrant();

		Thread t1 = new Thread() {

			public void run() {

				re.m();// calling method of Reentrant class
			}
		};
		t1.start();
		Thread t2 = new Thread() {

			public void run() {

				re.n();// calling method of Reentrant class
			}
		};
		t2.start();

	}
}