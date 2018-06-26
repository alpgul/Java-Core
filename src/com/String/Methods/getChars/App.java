package com.String.Methods.getChars;

public class App {

	public static void main(String[] args) {

		// public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination,
		// int dstBeginIndex)
		String str = new String("hello javatpoint how r u");
		char[] ch = new char[10];
		try {
			str.getChars(6, 16, ch, 0);
			System.out.println(ch);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
