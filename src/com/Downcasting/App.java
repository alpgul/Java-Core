package com.Downcasting;

public class App {

	public static void main(String[] args) {

		Animal a = new Dog3();
		Dog3.method(a);
		Animal a1 = new Dog4();
		Dog4.method(a1);
	}
}

// Possibility of downcasting with instanceof
class Animal {
}

class Dog3 extends
		Animal {

	static void method(Animal a) {

		if (a instanceof Dog3) {
			Dog3 d = (Dog3) a;// downcasting
			System.out.println("ok downcasting performed");
		}
	}

}

// Downcasting without the use of java instanceof
class Dog4 extends
		Animal {

	static void method(Animal a) {

		Dog4 d = (Dog4) a;// downcasting
		System.out.println("ok downcasting performed");
	}

	public static void main(String[] args) {

	}
}