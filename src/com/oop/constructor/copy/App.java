package com.oop.constructor.copy;

public class App {

	int id;

	String name;

	App(int i, String n) {

		id = i;
		name = n;
	}

	App(App s) {

		id = s.id;
		name = s.name;
	}

	void display() {

		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {

		App s1 = new App(111, "Karan");
		App s2 = new App(s1);
		s1.display();
		s2.display();
	}
}
