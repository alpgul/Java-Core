package com.ExceptionHandling.throw_key;

public class App {

	// java throw keyword example
	// özel istisna hata fýrlatabilme
	static void validate(int age) {

		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {

		validate(13);
		System.out.println("rest of the code...");
	}
}
