package com.instanceBlock.invokeFirstwithSuperkey;

public class App {

	public static void main(String args[]) {

		B2 b = new B2();
	}
}

class A {

	A() {

		// first
		System.out.println("parent class constructor invoked");
	}
}

class B2 extends
		A {

	B2() {

		super();
		System.out.println("child class constructor invoked");
	}

	{
		System.out.println("instance initializer block is invoked");
	}

}
