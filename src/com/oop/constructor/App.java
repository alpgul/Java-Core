package com.oop.constructor;

public class App {

	int id;

	String name;

	App(int i, String n) {

		id = i;
		name = n;
	}

	void display() {

		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {

		App s1 = new App(111, "Karan");
		App s2 = new App(222, "Aryan");
		s1.display();
		s2.display();
	}
}
