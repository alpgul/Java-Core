package com.MultiThread.Garbage_Collection;

/*Garbage Collection
 * Kullan�lmayan nesneleri yok etmenin bir yoludur.
 * Javada otomatik olarak yap�l�r.
 * -��p toplay�c� ilgisiz nesneleri y���n belle�inden kald�rd��� i�in java belle�i verimli hale getirir.
 * -��p toplay�c� (JVM'nin bir par�as�) taraf�ndan otomatik olarak yap�l�r b�ylece ekstra �aba sarf etmemize gerek yoktur.
 * Sadece new anahtar kelimesiyle olu�turulan nesneleri temizler.
 * GC Deamon thread taraf�ndan �a�r�l�r.Gc �a�r�m� �ncesi finalize methodu �a�r�l�r.
 * 
 * Bir nesne nasil referanss�z hale getirilir?
 * */
class Employee {
}

class TestGarbage1 {

	public static void main(String[] args) {

		// By nulling a reference:(null yaparak)
		Employee e = new Employee();
		e = null;

		// By assigning a reference to another:(referans de�i�tirerek)
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1 = e2;// now the first object referred by e1 is available for garbage collection

		// By annonymous object:(referans i�aretsiz)
		new Employee();
	}
}

// finalize() method
/*
 * Nesne ��p toplanmadan �nce her seferinde finalize () y�ntemi �a�r�l�r. 
 *  Bu y�ntem temizleme i�lemini ger�ekle�tirmek i�in kullan�labilir.  
 *  */

// gc() method
/*
 * ��p toplay�c�y� �a��rmak i�in kullan�l�r
 * Runtime ve System s�n�flar�nda bulunur.
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