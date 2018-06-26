package com.String.Methods.format;

public class App {

	// Java String format() method example
	public static void main(String[] args) {

		String name = "sonoo";
		String sf1 = String.format("name is %s", name);
		String sf2 = String.format("value is %f", 32.33434);
		String sf3 = String.format("value is %.12f", 32.33434);// returns 12 char fractional part filling with 0
		// value is 32,334340000000
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
	}
}
