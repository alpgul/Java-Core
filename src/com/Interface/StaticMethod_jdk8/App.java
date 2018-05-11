package com.Interface.StaticMethod_jdk8;

public class App {

	public static void main(String args[]) {

		Drawable d = new Rectangle();
		d.draw();
		System.out.println(Drawable.cube(3));
	}
}

interface Drawable {

	void draw();

	static int cube(int x) {

		return x * x * x;
	}
}

class Rectangle implements
		Drawable {

	public void draw() {

		System.out.println("drawing rectangle");
	}
}
