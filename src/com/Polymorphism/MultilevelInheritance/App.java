package com.Polymorphism.MultilevelInheritance;

public class App {

	public static void main(String args[]) {

		Animal a = new BabyDog1();
		a.eat();// dog is eating...

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

class BabyDog1 extends
		Dog {

}