package com.oop.Static.variable;

public class App {

	static int count = 0;// hafýzayý sadece bir kez alacak ve deðerini koruyacak

	App() {

		count++;
		System.out.println(count);
	}

	public static void main(String args[]) {

		new App();
		new App();
		new App();

	}
}
