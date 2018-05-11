package com.instanceofKey.nullVariable;

public class App {

	public static void main(String[] args) {

		Dog2 d = null;
		System.out.println(d instanceof Dog2);// false
	}
}

class Dog2 {

}