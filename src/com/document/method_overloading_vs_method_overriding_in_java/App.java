package com.document.method_overloading_vs_method_overriding_in_java;

/*
 * No.	Method Overloading														Method Overriding
	1)	Method overloading is used to increase the readability of the program.	
	
	1-Method Overriding)	Method overriding is used to provide the specific implementation of the method that is already provided by its super class.
	2)	Method overloading is performed within class.	
	
	2-Method Overriding)	Method overriding occurs in two classes that have IS-A (inheritance) relationship.
	3)	In case of method overloading, parameter must be different.	
	
	3-Method Overriding)	In case of method overriding, parameter must be same.
	4)	Method overloading is the example of compile time polymorphism.	
	
	4-Method Overriding)	Method overriding is the example of run time polymorphism.
	5)	In java, method overloading can't be performed by changing return type of the method only. Return type can be same or different in method overloading. But you must have to change the parameter.
	
	5-Method Overriding)	Return type must be same or covariant in method overriding.*/
public class App {

}

class OverloadingExample {

	static int add(int a, int b) {

		return a + b;
	}

	static int add(int a, int b, int c) {

		return a + b + c;
	}
}

class Animal {

	void eat() {

		System.out.println("eating...");
	}
}

class Dog extends
		Animal {

	void eat() {

		System.out.println("eating bread...");
	}
}