package com.inner_classes.Anonymous_inner_class;

public class App {

	private String privateVariable = "private variable";

	private void outerMethod() {

		System.out.println("Outer method");
	}

	// Eðer Anonymous sýnýf Class içinde tanýmlanmýþsa method ve deðiþkenlere
	// ulaþabiliriz.
	Person person = new Person() {

		final static String finalStaticVariable = "i am final static variable";

		// static String StaticVariable = "i am final static variable";

		// Static deðiþken sadece final olarak tanýmlanýr static method tanýmlanamaz
		void eat() {

			System.out.println(privateVariable);
			outerMethod();
		}
		// static void compileError() {}
		// final static void compileErrorToo() {}
	};

	public static void main(String args[]) {

		// Eðer method içinde Anonymous tanýmlanmýþsa sadece local deðiþkenlere
		// ulaþabiliriz.
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
		// p.sleep(); sleep metoduðunu çaðýramayýz çünkü person abstract sýnýfýnda
		// tanimli deðiþ referans tipi person olduðu için o sýnýfa ait metodlari
		// cagiririz ama oluþturulan obje "App$1" alt sýnýfýndan oluþuyor olacaktýr

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
				// Sýnýf içindeki global deðiþkenlere aþaðýdaki gibi ulaþýlýr eðer static method
				// içinde kullanýlmýþsa ulaþýlamaz
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

// method argumentinde anonymous sýnýf oluþturma
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
