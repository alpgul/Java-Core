package com.String.StringBuffer;

public class App {

	public static void main(String[] args) {

		// StringBuffer append() method
		// StringBuffer() 16 karaterlik bo� dize olu�turur
		// StringBuffer(String str) str ile belirtilen dize ile birlikte 16+str.lenght
		// dize olu�turur.
		// StringBuffer(int capacity) argumentteki int kadar bo� dize olu�turur
		// StringBuffer senkron �al���r.

		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(System.identityHashCode(sb));// prints Hello Java
		// adres de�i�medi veri String Poolda tutulmaz
		// append(String s) alttaki s�n�flara overload etmi�tir.
		// append(char), append(boolean), append(int), append(float), append(double)
		// etc.
		// Stringden fark� yeni veri olu�maz var olana eklenir

		// StringBuffer insert(int,String) method
		// Append methodundan fark� ba�lang�� bozisyonu belirtebilmemizdir
		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.insert(1, "Java");// now original string is changed
		System.out.println(sb1);// prints HJavaello

		// StringBuffer replace(int,int,String) method
		// ilk parametre de�i�ecek itrafenin ilk index ile ikinci parametredeki
		// ifayedeyle son index aras�daki de�erin de�i�mesi ilk index dahil son index
		// dahil degil
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.replace(1, 3, "Java");
		System.out.println(sb2);// prints HJavalo

		// StringBuffer delete() method
		// ilk parametre ba�lang�� index ile ikinci parametredeki
		// son index aras�daki de�erin silinmesi ilk index dahil son index
		// dahil degil
		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.delete(1, 3);
		System.out.println(sb3);// prints Hlo

		// StringBuffer reverse() method
		// String ifadeyi ters �evirir.
		StringBuffer sb4 = new StringBuffer("Hello");
		sb4.reverse();
		System.out.println(sb4);// prints olleH

		// StringBuffer capacity() method
		// String ifade e�er 16 kapasiteyi a�arsa mevcut kapasitenin 2 kat� art� 2
		// dir (oldcapacity*2)+2=34 e�er eklenen ifade mevcut kapasitenin 2 kat�n�n 2
		// fazlas�n� a�arsa kapasite Stringbufferda var olan uzunluk olur
		StringBuffer sb5 = new StringBuffer();
		System.out.println(sb5.capacity());// default 16
		sb5.append("Hello");
		System.out.println(sb5.capacity());// now 16
		sb5.append("java is my favourite language");
		System.out.println(sb5.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

		// StringBuffer ensureCapacity() method
		// Veri eklemeden kapasiteyi artt�rmak i�in kullan�l�r
		// Parametreyle belirtilen de�er e�er mevcut kapasiteden b�y�k de�ilse de�i�mez
		// e�er b�y�kse mevcut kapasitenin 2 kat�n�n 2 fazlas� artar e�er elde edilen
		// de�er parametreden kucukse yen� kapasite parametredeki de�er olur
		StringBuffer sb6 = new StringBuffer();
		System.out.println(sb6.capacity());// default 16
		sb6.append("Hello");
		System.out.println(sb6.capacity());// now 16
		sb6.append("java is my favourite language");
		System.out.println(sb6.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb6.ensureCapacity(10);// now no change
		System.out.println(sb6.capacity());// now 34
		sb6.ensureCapacity(70);// now (34*2)+2
		System.out.println(sb6.capacity());// now 70
	}
}
