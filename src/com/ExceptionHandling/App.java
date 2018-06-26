package com.ExceptionHandling;

public class App {

	public static void main(String[] args) {

		// If we divide any number by zero,
		// there occurs an ArithmeticException.
		int a = 50 / 0;// ArithmeticException

		// If we have null value in any variable,
		// performing any operation by the variable occurs an NullPointerException.
		String s = null;
		System.out.println(s.length());// NullPointerException

		// The wrong formatting of any value, may occur NumberFormatException. Suppose I
		// have a string variable that have characters, converting this variable into
		// digit will occur NumberFormatException.
		String s1 = "abc";
		int i = Integer.parseInt(s1);// NumberFormatException

		// If you are inserting any value in the wrong index, it would result
		// ArrayIndexOutOfBoundsException as shown below:
		int a1[] = new int[5];
		a1[10] = 50; // ArrayIndexOutOfBoundsException
	}
}
