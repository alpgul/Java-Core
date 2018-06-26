package com.String.StringBuffer;

public class App {

	public static void main(String[] args) {

		// StringBuffer append() method
		// StringBuffer() 16 karaterlik boþ dize oluþturur
		// StringBuffer(String str) str ile belirtilen dize ile birlikte 16+str.lenght
		// dize oluþturur.
		// StringBuffer(int capacity) argumentteki int kadar boþ dize oluþturur
		// StringBuffer senkron çalýþýr.

		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(System.identityHashCode(sb));// prints Hello Java
		// adres deðiþmedi veri String Poolda tutulmaz
		// append(String s) alttaki sýnýflara overload etmiþtir.
		// append(char), append(boolean), append(int), append(float), append(double)
		// etc.
		// Stringden farký yeni veri oluþmaz var olana eklenir

		// StringBuffer insert(int,String) method
		// Append methodundan farký baþlangýç bozisyonu belirtebilmemizdir
		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.insert(1, "Java");// now original string is changed
		System.out.println(sb1);// prints HJavaello

		// StringBuffer replace(int,int,String) method
		// ilk parametre deðiþecek itrafenin ilk index ile ikinci parametredeki
		// ifayedeyle son index arasýdaki deðerin deðiþmesi ilk index dahil son index
		// dahil degil
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.replace(1, 3, "Java");
		System.out.println(sb2);// prints HJavalo

		// StringBuffer delete() method
		// ilk parametre baþlangýç index ile ikinci parametredeki
		// son index arasýdaki deðerin silinmesi ilk index dahil son index
		// dahil degil
		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.delete(1, 3);
		System.out.println(sb3);// prints Hlo

		// StringBuffer reverse() method
		// String ifadeyi ters çevirir.
		StringBuffer sb4 = new StringBuffer("Hello");
		sb4.reverse();
		System.out.println(sb4);// prints olleH

		// StringBuffer capacity() method
		// String ifade eðer 16 kapasiteyi aþarsa mevcut kapasitenin 2 katý artý 2
		// dir (oldcapacity*2)+2=34 eðer eklenen ifade mevcut kapasitenin 2 katýnýn 2
		// fazlasýný aþarsa kapasite Stringbufferda var olan uzunluk olur
		StringBuffer sb5 = new StringBuffer();
		System.out.println(sb5.capacity());// default 16
		sb5.append("Hello");
		System.out.println(sb5.capacity());// now 16
		sb5.append("java is my favourite language");
		System.out.println(sb5.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

		// StringBuffer ensureCapacity() method
		// Veri eklemeden kapasiteyi arttýrmak için kullanýlýr
		// Parametreyle belirtilen deðer eðer mevcut kapasiteden büyük deðilse deðiþmez
		// eðer büyükse mevcut kapasitenin 2 katýnýn 2 fazlasý artar eðer elde edilen
		// deðer parametreden kucukse yený kapasite parametredeki deðer olur
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
