package com.This.constructor.call;

class B {

	App obj;

	B(App obj) {

		this.obj = obj;
	}

	void display() {

		System.out.println(this.toString() + "= " + obj.data);// using data member of App class
	}
}

class App {

	int data = 10;

	App() {

		B b = new B(this);
		b.display();
	}

	public static void main(String args[]) {

		App a = new App();
	}
}