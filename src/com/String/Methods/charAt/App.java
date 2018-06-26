package com.String.Methods.charAt;

public class App {

	public static void main(String[] args) {

		// Java String charAt() method example
		String name = "javatpoint";
		char ch = name.charAt(4);// returns the char value at the 4th index
		System.out.println(ch);

		// StringIndexOutOfBoundsException with charAt()
		String name1 = "javatpoint";
		char ch1 = name1.charAt(10);// returns the char value at the 10th index
		System.out.println(ch1);
	}
}
