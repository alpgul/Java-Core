package com.dynamicBinding;

public class App {

	private void eat() {

		System.out.println("dog is eating...");
	}

	public static void main(String[] args) {

		// variables have a type
		int data = 30;
		// References have a type
		App a1;// Here a1 is a type of App
		// Objects have a type
		App d2 = new App();
		// static binding
		App d1 = new App();
		d1.eat();
		// Example of dynamic binding
		Animal a = new Dog();
		a.eat();
	}
}

class Animal {

	void eat() {

		System.out.println("animal is eating...");
	}
}

class Dog extends
		Animal {

	void eat() {

		System.out.println("dog is eating...");
	}
}