package com.Polymorphism.Upcasting;

public class App {

	public static void main(String args[]) {

		Bike b = new Splender();// upcasting
		b.run();
	}
}

class Bike {

	void run() {

		System.out.println("running");
	}
}

class Splender extends
		Bike {

	void run() {

		System.out.println("running safely with 60km");
	}

}