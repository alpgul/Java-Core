package com.inner_classes.Anonymous_inner_class;

public class App {

	private String privateVariable = "private variable";

	private void outerMethod() {

		System.out.println("Outer method");
	}

	// E�er Anonymous s�n�f Class i�inde tan�mlanm��sa method ve de�i�kenlere
	// ula�abiliriz.
	Person person = new Person() {

		final static String finalStaticVariable = "i am final static variable";

		// static String StaticVariable = "i am final static variable";

		// Static de�i�ken sadece final olarak tan�mlan�r static method tan�mlanamaz
		void eat() {

			System.out.println(privateVariable);
			outerMethod();
		}
		// static void compileError() {}
		// final static void compileErrorToo() {}
	};

	public static void main(String args[]) {

		// E�er method i�inde Anonymous tan�mlanm��sa sadece local de�i�kenlere
		// ula�abiliriz.
		String localVariable = "I am local variable";
		final String finalLocalVariable = "I am final local variable";
		Person p = new Person() {

			void eat() {

				System.out.println("nice fruits");
				System.out.println(finalLocalVariable);
				System.out.println(localVariable);
			}

			public void sleep() {

			}
		};
		p.eat();
		// p.sleep(); sleep metodu�unu �a��ramay�z ��nk� person abstract s�n�f�nda
		// tanimli de�i� referans tipi person oldu�u i�in o s�n�fa ait metodlari
		// cagiririz ama olu�turulan obje "App$1" alt s�n�f�ndan olu�uyor olacakt�r

		Eatable e = new Eatable() {

			public void eat() {

				System.out.println("nice fruits");
			}
		};
		e.eat();
	}
}

abstract class Person {

	abstract void eat();
}
/*
static class App$1 extends
		Person {

	App$1() {

	}

	void eat() {

		System.out.println("nice fruits");
	}
}*/

// Java anonymous inner class example using interface
interface Eatable {

	void eat();
}

/*static class TestAnonymousInner1$1 implements
		Eatable {

	TestAnonymousInner1$1() {

	}

void eat(){System.out.println("nice fruits");}
}*/
class Anonymous {

	void test() {

	}
}

class AnonymousTest4 {

	private String shadowing = "Shadowing Outer";

	public void outerMethod() {

		Anonymous anonymous = new Anonymous() {

			void test() {

				String shadowing = "Shadowing Anonymous";
				System.out.println(shadowing);
				// S�n�f i�indeki global de�i�kenlere a�a��daki gibi ula��l�r e�er static method
				// i�inde kullan�lm��sa ula��lamaz
				System.out.println(AnonymousTest4.this.shadowing);
			}
		};
		anonymous.test();
	}

}

// Argument-Defined Anonymous Inner Class
interface MyInterface {

	void test();
}

class MyClass {

	void doStuff(MyInterface iface) {

		iface.test();

		System.out.println("MyClass doStuff");
	}
}

// method argumentinde anonymous s�n�f olu�turma
class ArgumentDefinedAnonymous {

	public static void main(String[] args) {

		MyClass myClass = new MyClass();

		myClass.doStuff(new MyInterface() {

			@Override
			public void test() {

				System.out.println("iface test");
			}// test metodu
		}// anonymous inner class
		); // doStuff metodu
	}
}
