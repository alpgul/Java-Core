package com.This.constructor;

class A {

	A() {

		// this(5);
		System.out.println("hello a");// 5 hello a
	}

	A(int x) {

		this();
		System.out.println(x);
	}
}

public class App {

	public static void main(String args[]) {

		A a = new A(10);
		// hello a
		// 10

	}
}
