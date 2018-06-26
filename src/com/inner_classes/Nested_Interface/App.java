package com.inner_classes.Nested_Interface;

import com.inner_classes.Nested_Interface.App.NestedInterface;

/**
 * Nested Interface deðiþkenleri final static publicdir
 * {@link Message#Ivariable} Nested Interface staticdir.
 */
interface Showable {

	void show();

	interface Message {

		public static final String Ivariable = "123";

		void msg();
	}
}
// Derleme Sonucu:

/*
 * 
 * public static interface Showable$Message {

	public abstract void msg();
}
*/

public class App implements
		Showable.Message,
		Showable {

	// Outer class icerisinde Nested Interface tanimlayabiliriz
	interface NestedInterface {

		void nestedMethod();
	}

	public void msg() {

		System.out.println("Hello nested interface");
	}

	public static void main(String args[]) {

		Showable.Message message = new App();// upcasting here
		message.msg();
	}

	@Override
	public void show() {

		// TODO Auto-generated method stub

	}
}

class OuterClass implements
		App.NestedInterface {

	@Override
	public void nestedMethod() {

	}

}

interface OuterInterface extends
		NestedInterface {

}

// Ýnterface icinde class tanýmlanabilir.

interface M {

	class A {
	}
}