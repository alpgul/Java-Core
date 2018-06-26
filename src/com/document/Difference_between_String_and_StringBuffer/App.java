package com.document.Difference_between_String_and_StringBuffer;

/*
No.	String							 StringBuffer
1)	String class is immutable.(geni�lemez)	
StringBuffer class is mutable.(geni�ler)
2)	String is slow and consumes more memory when you concat too many strings because every time it creates new instance.	String ekleme i�leminde yeni nesne olu�turur.
StringBuffer is fast and consumes less memory when you cancat strings.String ekleme i�leminde yeni nesne olu�maz.
3)	String class overrides the equals() method of Object class. So you can compare the contents of two strings by equals() method.	
StringBuffer class doesn't override the equals() method of Object class. equals metodu direk kullan�lanamaz*/
public class App {

	// Performance Test of String and StringBuffer
	// 10000 adet ekleme i�emi sonucu String ve StringBuffer fark�
	public static String concatWithString() {

		String t = "Java";
		for (int i = 0; i < 10000; i++) {
			t = t + "Tpoint";
		}
		return t;
	}

	public static String concatWithStringBuffer() {

		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Tpoint");
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(
				"Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

		// String and StringBuffer HashCode Test
		System.out.println("Hashcode test of String:");
		String str = "java";
		System.out.println(str.hashCode());
		str = str + "tpoint";
		System.out.println(str.hashCode());

		System.out.println("Hashcode test of StringBuffer:");
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb.hashCode());
		sb.append("tpoint");
		System.out.println(sb.hashCode());
	}
}
