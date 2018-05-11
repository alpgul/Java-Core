package com.finalKey.methodwithoverride;

public class App {

	public static void main(String args[]) {

		Honda honda = new Honda();
		honda.run();
	}
}

class Bike {

	final void run() {

		System.out.println("running");
	}
}

class Honda extends
		Bike {

	// Compile Time Error
	void run() {

		System.out.println("running safely with 100kmph");
	}

}