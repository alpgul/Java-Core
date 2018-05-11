package com.Abstraction;

public class App {

	public static void main(String args[]) {

		Bank b;
		b = new SBI();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
		b = new PNB();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
	}
}

abstract class Bank {

	abstract int getRateOfInterest();
}

class SBI extends
		Bank {

	int getRateOfInterest() {

		return 7;
	}
}

class PNB extends
		Bank {

	int getRateOfInterest() {

		return 8;
	}
}

// example of abstract class that have method body
abstract class Bike {

	Bike() {

		System.out.println("bike is created");
	}

	abstract void run();

	void changeGear() {

		System.out.println("gear changed");
	}
}

class Honda extends
		Bike {

	void run() {

		System.out.println("running safely..");
	}
}

class TestAbstraction2 {

	public static void main(String args[]) {

		Bike obj = new Honda();
		obj.run();
		obj.changeGear();
	}
}

interface A {

	void a();

	void b();

	void c();

	void d();
}

abstract class B implements
		A {

	public void c() {

		System.out.println("I am c");
	}
}

class M extends
		B {

	public void a() {

		System.out.println("I am a");
	}

	public void b() {

		System.out.println("I am b");
	}

	public void d() {

		System.out.println("I am d");
	}
}

class Test5 {

	public static void main(String args[]) {

		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}