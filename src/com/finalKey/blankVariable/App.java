package com.finalKey.blankVariable;

public class App {

	public static void main(String args[]) {

		new Bike10();
	}
}

class Bike10 {

	final int speedlimit;// blank final variable

	Bike10() {

		speedlimit = 70;
		System.out.println(speedlimit);
	}

}

// Example of static blank final variable
class A {

	static final int data;// static blank final variable
	static {
		data = 50;
	}

	public static void main(String args[]) {

		System.out.println(A.data);
	}
}