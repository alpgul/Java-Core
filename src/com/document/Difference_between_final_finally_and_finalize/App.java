package com.document.Difference_between_final_finally_and_finalize;

/*
 *final	finally	finalize
1)	Final sýnýf yöntem ve deðiþken üzerinde kýsýtlamalar uygulamak için kullanýlýr.  Son sýnýf devralýnamaz son yöntem geçersiz kýlýnamaz ve son deðiþken deðeri deðiþtirilemez.
Son olarak önemli kod yerleþtirmek için kullanýlýr istisnanýn ele alýp almadýðýna bakýlmaksýzýn yürütülür.
Sonlandýrma nesne çöp toplanmadan hemen önce temizleme iþlemini gerçekleþtirmek için kullanýlýr.
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
		// garbage collected çaðrýlmadan önce iki obje null edilerek finalize edildi ve
		// silindi

	}
}
