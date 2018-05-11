package com.oop.Static.block;

public class App {

	static {
		// jdk7:Output:Error:
		// Main method not found in class A3,
		// please define the main method as:public static void main(String[] args)
		System.out.println("Output:static block is invoked (if not JDK7)");
		System.exit(0);
	}

	public static void main(String[] args) {

	}
}
