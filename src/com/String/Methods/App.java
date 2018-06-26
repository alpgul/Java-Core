package com.String.Methods;

public class App {

	public static void main(String[] args) {

		// Java String toUpperCase() and toLowerCase() method

		String s4 = "Sachin";
		System.out.println(s4.toUpperCase());// SACHIN adres de�i�ti
		System.out.println(s4.toLowerCase());// sachin adres de�i�ti
		System.out.println(s4);// Sachin(no change in original)
		// adres de�i�ti�i i�in de�i�iklik olmaz

		// Java String trim() method
		// �nce ve sonra olan bo�luklar� silme
		String s3 = "  Sachin  ";
		System.out.println(s3);// Sachin
		System.out.println(s3.trim());// Sachin

		// Java String startsWith() and endsWith() method
		// Ba�lang�� ve son harf kontrol�
		String s2 = "Sachin";
		System.out.println(s2.startsWith("Sa"));// true
		System.out.println(s2.endsWith("n"));// true

		// Java String charAt() method
		// Arg�mentte belirtirlen indexdeki karakteri d�nd�r�r.
		String s1 = "Sachin";
		System.out.println(s1.charAt(0));// S
		System.out.println(s1.charAt(3));// h

		// Java String length() method
		// Uzunluk de�erini d�nd�r�r
		String s = "Sachin";
		System.out.println(s.length());// 6

		// Java String intern() method
		// String Pool d���nda olu�turulan bir String ifadeyi String Poola ta��nmas�n�
		// sa�layan methoddur e�er string poolda ayn� veri varsa onun adresini g�sterir.
		String s5 = new String("Sachin1");
		String s6 = s5.intern();// adres de�i�ti string poolda s5 verisi olu�tu
		String s7 = "Sachin1";// s6 n�n adresini g�sterir
		System.out.println(s6);// Sachin

		// Java String valueOf() method
		// int, long, float, double, boolean, char and char array tipdeki de�erleri
		// string nesnesine �evirir
		int a = 10;
		String s8 = String.valueOf(a);
		System.out.println(s8 + 10);

		// Java String replace() method
		// �lk parametredeki de�eri ikinci parametredeki de�erle de�i�tirir.De�i�im
		// sonucu yeni adres olu�ur.
		String s9 = "Java is a programming language. Java is a platform. Java is an Island.";
		String replaceString = s9.replace("Java", "Kava");// replaces all occurrences of "Java" to "Kava"

		System.out.println(replaceString);
	}
}
