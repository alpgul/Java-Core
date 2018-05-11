package com.Covariant;

public class App {

	public static void main(String args[]) {

		new B1().get().message();
	}

}

class A {

	A get() {

		return this;
	}

}

class B1 extends
		A {

	B1 get() {

		// dönüþ tipi deðiþtirildi
		return this;
	}

	void message() {

		System.out.println("welcome to covariant return type");
	}

}