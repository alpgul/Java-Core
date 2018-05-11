package com.oop.Static.method;

public class App {

	int rollno;

	String name;

	static String college = "ITS";

	static void change() {

		college = "BBDIT";
	}

	App(int r, String n) {

		rollno = r;
		name = n;
	}

	void display() {

		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {

		App.change();

		App s1 = new App(111, "Karan");
		App s2 = new App(222, "Aryan");
		App s3 = new App(333, "Sonoo");

		s1.display();
		s2.display();
		s3.display();
	}
}
