package com.MultiThread.Runtime;

/**
 * * Java Runtime class
 * 
 * Java Runtime s�n�f� java �al��ma ortam� ile etkile�im i�in kullan�l�r. Java
 * Runtime s�n�f� bir i�lemi y�r�tmek GC'yi �a��rmak toplam ve bo� bellek almak
 * vb. Y�ntemleri sa�lar.
 * 
 * Runtime.getRuntime () y�ntemi Runtime s�n�f�n�n tekil �rne�ini d�nd�r�r.
 */
public class App {

	public static void main(String args[]) throws Exception {

		// Verilen komutu ayr� bir i�lemde y�r�t�r.
		Runtime.getRuntime().exec("notepad");// will open a new notepad

		// Mevcut sanal makineyi sonland�r�r
		// Runtime.getRuntime().exit(0);

		// yeni hook thread kaydeder
		// Runtime.getRuntime().addShutdownHook(Thread hook);

		// mevcut i�lemci say�s� d�nd�r�r.
		System.out.println(Runtime.getRuntime().availableProcessors() + " cores");

		// JVM'de bo� haf�za miktar�n� d�nd�r�r.
		System.out.println(Runtime.getRuntime().freeMemory() + " bytes");

		// JVM'de toplam belle�in miktar�n� d�nd�r�r.
		System.out.println(Runtime.getRuntime().totalMemory() + " bytes");

	}
}