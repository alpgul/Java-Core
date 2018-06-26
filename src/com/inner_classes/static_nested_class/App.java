package com.inner_classes.static_nested_class;

/**
 * Static nested classa kapsayan s�n�f yard�m�yla ula��labilir.
 * {@link App.Inner()}.
 * 
 *
 * Static nested classda tan�mlanan static methoda eri�im i�in kapsayan s�n�fa
 * ihtiya� yoktur.{@link App.Inner#StaticMsg()}
 *
 * Static nested classda static veya non-static de�i�ken tan�mlanabilir.
 * non-static de�i�kenlere eri�im static methodlardan sa�lanamaz.
 * {@link Inner#StaticMsg()}
 *
 * Static nested class kapsayan s�n�f�n statik de�i�kenlerine
 * eri�ebilir.{@link App#data}Statik olmaya de�erlere eri�ilemez
 * {@link App#teString}
 */
public class App {

	private String teString = "asd";

	static int data = 30;

	static class Inner {

		private String instanceVariable = "I am instance variable";

		private static String staticVariable = "i am static variable";

		void msg() {

			System.out.println("data is " + data);
		}

		static void StaticMsg() {

			// System.out.println(instanceVariable);

			// System.out.println(teString);
			System.out.println(staticVariable);

			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {

		App.Inner obj = new App.Inner();
		obj.msg();
		App.Inner.StaticMsg();
	}
}

// Derleme Sonucu:

/*
 * import java.io.PrintStream;

static class TestOuter1$Inner {

	TestOuter1$Inner() {

	}

	void msg() {

		System.out.println((new StringBuilder()).append("data is ").append(TestOuter1.data).toString());
	}
}*/
