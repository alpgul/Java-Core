package com.oop.constructor.overloading;

public class App {

	int id;

	String name;

	int age;

	App(int i, String n) {

		id = i;
		name = n;
	}

	App(int i, String n, int a) {

		id = i;
		name = n;
		age = a;
	}

	void display() {

		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {

		App s1 = new App(111, "Karan");
		App s2 = new App(222, "Aryan", 25);
		s1.display();
		s2.display();
	}
}
