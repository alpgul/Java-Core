package com.document.Difference_between_final_finally_and_finalize;

/*
 *final	finally	finalize
1)	Final s�n�f y�ntem ve de�i�ken �zerinde k�s�tlamalar uygulamak i�in kullan�l�r.  Son s�n�f devral�namaz son y�ntem ge�ersiz k�l�namaz ve son de�i�ken de�eri de�i�tirilemez.
Son olarak �nemli kod yerle�tirmek i�in kullan�l�r istisnan�n ele al�p almad���na bak�lmaks�z�n y�r�t�l�r.
Sonland�rma nesne ��p toplanmadan hemen �nce temizleme i�lemini ger�ekle�tirmek i�in kullan�l�r.
2)	Final bir anahtar kelimedir.
finally  bir bloktur.	
Finalize bir metod. */
public class App {

	public void finalize() {

		System.out.println("finalize called");
	}

	public static void main(String[] args) {

		// Java final example
		final int x = 100;
		// x = 200;// Compile Time Error

		// Java finally example
		try {
			int x1 = 300;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is executed");
		}

		// Java finalize example

		App f1 = new App();
		App f2 = new App();
		f1 = null;
		f2 = null;
		System.gc();
		// garbage collected �a�r�lmadan �nce iki obje null edilerek finalize edildi ve
		// silindi

	}
}
