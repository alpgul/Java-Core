package com.This.constructor.returnthis;

class A {

	A getA() {

		return this;
	}

	void msg() {

		System.out.println("Hello java");
	}
}

public class App {

	public static void main(String args[]) {

		new A().getA().msg();
	}
}
