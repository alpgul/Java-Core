package com.Overloading.ReturnTypeOfArguments;

public class App {

	public static void main(String[] args) {

		System.out.println(Adder.add(11, 11));// belirsizlik
		// Compile Time Error: method add(int,int) is already defined in class Adder
	}

}

class Adder {

	static int add(int a, int b) {

		return a + b;
	}

	static double add(int a, int b) {

		return a + b;
	}
}