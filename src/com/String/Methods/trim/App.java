package com.String.Methods.trim;

public class App {

	public static void main(String[] args) {

		// The string trim() method doesn't omits middle spaces.
		// ba�lang�c ve sondaki bo�luklar� silme
		String s1 = "  hello string   ";
		System.out.println(s1 + "javatpoint");// without trim()
		System.out.println(s1.trim() + "javatpoint");// with trim()
	}
}
