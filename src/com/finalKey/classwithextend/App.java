package com.finalKey.classwithextend;

public class App {

	public static void main(String args[]) {

		Honda1 honda = new Honda1();
		honda.run();
	}
}

// Compile Time Error
final class Bike {
}

class Honda1 extends
		Bike {

	void run() {

		System.out.println("running safely with 100kmph");
	}

}