package com.ExceptionHandling.try_catch;

public class App {

	public static void main(String[] args) {

		// Syntax of java try-catch
		try {
			int data = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");
		// Syntax of try-finally block
		try {
			// code that may throw exception
		} finally {
		}
	}
}
