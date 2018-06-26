package com.inner_classes.static_nested_class;

/**
 * Static nested classa kapsayan sýnýf yardýmýyla ulaþýlabilir.
 * {@link App.Inner()}.
 * 
 *
 * Static nested classda tanýmlanan static methoda eriþim için kapsayan sýnýfa
 * ihtiyaç yoktur.{@link App.Inner#StaticMsg()}
 *
 * Static nested classda static veya non-static deðiþken tanýmlanabilir.
 * non-static deðiþkenlere eriþim static methodlardan saðlanamaz.
 * {@link Inner#StaticMsg()}
 *
 * Static nested class kapsayan sýnýfýn statik deðiþkenlerine
 * eriþebilir.{@link App#data}Statik olmaya deðerlere eriþilemez
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
