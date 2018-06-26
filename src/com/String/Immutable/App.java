package com.String.Immutable;

public class App {

	public static void main(String[] args) {

		String s = "Sachin";
		s.concat(" Tendulkar");// concat() method appends the string at the end
		// nesneye ait adres deðiþtiðinden s referansýna yeni adresi eþitleyerek
		// bildirmek gerekir
		System.out.println(s + ":" + System.identityHashCode(s));// will print Sachin because strings are immutable
		s = s.concat(" Tendulkar");// adres deðiþti ve bildirildi
		System.out.println(s + ":" + System.identityHashCode(s));  												// objects
	}
}
