package com.String.Methods;

public class App {

	public static void main(String[] args) {

		// Java String toUpperCase() and toLowerCase() method

		String s4 = "Sachin";
		System.out.println(s4.toUpperCase());// SACHIN adres deðiþti
		System.out.println(s4.toLowerCase());// sachin adres deðiþti
		System.out.println(s4);// Sachin(no change in original)
		// adres deðiþtiði için deðiþiklik olmaz

		// Java String trim() method
		// Önce ve sonra olan boþluklarý silme
		String s3 = "  Sachin  ";
		System.out.println(s3);// Sachin
		System.out.println(s3.trim());// Sachin

		// Java String startsWith() and endsWith() method
		// Baþlangýç ve son harf kontrolü
		String s2 = "Sachin";
		System.out.println(s2.startsWith("Sa"));// true
		System.out.println(s2.endsWith("n"));// true

		// Java String charAt() method
		// Argümentte belirtirlen indexdeki karakteri döndürür.
		String s1 = "Sachin";
		System.out.println(s1.charAt(0));// S
		System.out.println(s1.charAt(3));// h

		// Java String length() method
		// Uzunluk deðerini döndürür
		String s = "Sachin";
		System.out.println(s.length());// 6

		// Java String intern() method
		// String Pool dýþýnda oluþturulan bir String ifadeyi String Poola taþýnmasýný
		// saðlayan methoddur eðer string poolda ayný veri varsa onun adresini gösterir.
		String s5 = new String("Sachin1");
		String s6 = s5.intern();// adres deðiþti string poolda s5 verisi oluþtu
		String s7 = "Sachin1";// s6 nýn adresini gösterir
		System.out.println(s6);// Sachin

		// Java String valueOf() method
		// int, long, float, double, boolean, char and char array tipdeki deðerleri
		// string nesnesine çevirir
		int a = 10;
		String s8 = String.valueOf(a);
		System.out.println(s8 + 10);

		// Java String replace() method
		// Ýlk parametredeki deðeri ikinci parametredeki deðerle deðiþtirir.Deðiþim
		// sonucu yeni adres oluþur.
		String s9 = "Java is a programming language. Java is a platform. Java is an Island.";
		String replaceString = s9.replace("Java", "Kava");// replaces all occurrences of "Java" to "Kava"

		System.out.println(replaceString);
	}
}
