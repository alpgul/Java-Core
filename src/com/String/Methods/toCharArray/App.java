package com.String.Methods.toCharArray;

public class App {

	public static void main(String[] args) {

		// char array dönüþtürme
		String s1 = "hello";
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
