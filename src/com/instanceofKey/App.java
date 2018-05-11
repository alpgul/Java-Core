package com.instanceofKey;

public class App {

	public static void main(String args[]) {

		App s = new App();
		System.out.println(s instanceof App);// true

		Dog1 d = new Dog1();
		System.out.println(d instanceof Animal);// true
	}
}

class Animal {
}

class Dog1 extends
		Animal {// Dog inherits Animal

}