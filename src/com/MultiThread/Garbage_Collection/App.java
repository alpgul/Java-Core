package com.MultiThread.Garbage_Collection;

/*Garbage Collection
 * Kullanýlmayan nesneleri yok etmenin bir yoludur.
 * Javada otomatik olarak yapýlýr.
 * -Çöp toplayýcý ilgisiz nesneleri yýðýn belleðinden kaldýrdýðý için java belleði verimli hale getirir.
 * -Çöp toplayýcý (JVM'nin bir parçasý) tarafýndan otomatik olarak yapýlýr böylece ekstra çaba sarf etmemize gerek yoktur.
 * Sadece new anahtar kelimesiyle oluþturulan nesneleri temizler.
 * GC Deamon thread tarafýndan çaðrýlýr.Gc çaðrýmý öncesi finalize methodu çaðrýlýr.
 * 
 * Bir nesne nasil referanssýz hale getirilir?
 * */
class Employee {
}

class TestGarbage1 {

	public static void main(String[] args) {

		// By nulling a reference:(null yaparak)
		Employee e = new Employee();
		e = null;

		// By assigning a reference to another:(referans deðiþtirerek)
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1 = e2;// now the first object referred by e1 is available for garbage collection

		// By annonymous object:(referans iþaretsiz)
		new Employee();
	}
}

// finalize() method
/*
 * Nesne çöp toplanmadan önce her seferinde finalize () yöntemi çaðrýlýr. 
 *  Bu yöntem temizleme iþlemini gerçekleþtirmek için kullanýlabilir.  
 *  */

// gc() method
/*
 * Çöp toplayýcýyý çaðýrmak için kullanýlýr
 * Runtime ve System sýnýflarýnda bulunur.
 * */
public class App {

	@Override
	protected void finalize() throws Throwable {

		System.out.println("object is garbage collected");

	}

	public static void main(String args[]) {

		App s1 = new App();
		App s2 = new App();
		s1 = null;
		s2 = null;
		System.gc();
		// Runtime.getRuntime().gc();
	}
}