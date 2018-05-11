package com.Overloading.TypePromotionOfArguments;

public class App {

	public static void main(String args[]) {

		OverloadingCalculation1 obj = new OverloadingCalculation1();
		obj.sum(20, 20);// now second int literal will be promoted to long
		obj.sum(20, 20, 20);
		// yukarýda tip int olduðundan eðer int tipi yoksa int alt overloadlarýný cevrim
		// olur ama üste olmaz
		// yani int float long double cevrimi olur short byte olmaz
		// byte>short>int>long>float>double
		// char>int
	}
}

class OverloadingCalculation1 {

	void sum(int a, long b) {

		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {

		System.out.println(a + b + c);
	}

}