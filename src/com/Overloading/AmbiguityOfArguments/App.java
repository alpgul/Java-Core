package com.Overloading.AmbiguityOfArguments;

public class App {

	public static void main(String args[]) {

		OverloadingCalculation3 obj = new OverloadingCalculation3();
		obj.sum(20, 20);// belirsizlik int int tipi tan�ml� olmad��� i�in alt overloadlara bakt���nda
						// s�n�fa ait 2 method oldu�undan belirsizlik olmu�tur
	}

}

class OverloadingCalculation3 {

	void sum(int a, long b) {

		System.out.println("a method invoked");
	}

	void sum(long a, int b) {

		System.out.println("b method invoked");
	}

}