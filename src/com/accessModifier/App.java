package com.accessModifier;

import javafx.scene.layout.Background;

/*
 *"Access Modifier"	"within class"	"within package"	"outside package by subclass only(extend)"	"outside package"
	Private					Y				N					N									N
	Default					Y				Y					N									N
	Protected				Y				Y					Y									N
	Public					Y				Y					Y									Y
*/
//Simple example of private access modifier
class A {

	private int data = 40;

	private void msg() {

		System.out.println("Hello java");
	}
}

public class App {

	public static void main(String args[]) {

		A obj = new A();
		System.out.println(obj.data);// Compile Time Error
		obj.msg();// Compile Time Error
		//
		B obj = new B());// Compile Time Error
	}
}

// Role of Private Constructor
class B {

	private B() {

	}// private constructor

	void msg() {

		System.out.println("Hello java");
	}
}

// protected access modifier
class C {

	protected void msg() {

		System.out.println("Hello");
	}
}
