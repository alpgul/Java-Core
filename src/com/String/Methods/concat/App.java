package com.String.Methods.concat;

public class App {

	public static void main(String[] args) {

		// Java String concat() method example
		// String ifadeye ekleme yaparak yeni ifade oluþturma
		String s1 = "java string";
		s1.concat("is immutable");
		System.out.println(s1);
		s1 = s1.concat(" is immutable so assign it explicitly");
		System.out.println(s1);
	}
}
