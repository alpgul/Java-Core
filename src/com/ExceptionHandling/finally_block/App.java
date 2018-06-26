package com.ExceptionHandling.finally_block;

public class App {

	public static void main(String[] args) {

		// Usage of Java finally
		// case1:exception doesn't occur.
		try {
			int data = 25 / 5;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");

		// case2:exception occurs and not handled firstly:finally > secondly:exception
		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");

		// case3:exception occurs and handled. second:finally < first:exception
		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
		/*Exception in thread main java.lang.ArithmeticException:/ by zero
		finally block is always executed
		rest of the code...*/
	}
}
