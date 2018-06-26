package com.MultiThread.Runtime;

/**
 * * Java Runtime class
 * 
 * Java Runtime sýnýfý java çalýþma ortamý ile etkileþim için kullanýlýr. Java
 * Runtime sýnýfý bir iþlemi yürütmek GC'yi çaðýrmak toplam ve boþ bellek almak
 * vb. Yöntemleri saðlar.
 * 
 * Runtime.getRuntime () yöntemi Runtime sýnýfýnýn tekil örneðini döndürür.
 */
public class App {

	public static void main(String args[]) throws Exception {

		// Verilen komutu ayrý bir iþlemde yürütür.
		Runtime.getRuntime().exec("notepad");// will open a new notepad

		// Mevcut sanal makineyi sonlandýrýr
		// Runtime.getRuntime().exit(0);

		// yeni hook thread kaydeder
		// Runtime.getRuntime().addShutdownHook(Thread hook);

		// mevcut iþlemci sayýsý döndürür.
		System.out.println(Runtime.getRuntime().availableProcessors() + " cores");

		// JVM'de boþ hafýza miktarýný döndürür.
		System.out.println(Runtime.getRuntime().freeMemory() + " bytes");

		// JVM'de toplam belleðin miktarýný döndürür.
		System.out.println(Runtime.getRuntime().totalMemory() + " bytes");

	}
}