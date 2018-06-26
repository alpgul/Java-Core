package com.ExceptionHandling.MethodOverriding;

import java.io.IOException;

public class App {

	public static void main(String args[]) {

		Parent p = new TestExceptionChild();
		p.msg();
	}
}

// Üst sýnýf yöntemi bir istisna bildirmezse, alt sýnýf geçersiz kýlma
// yöntemi, denetlenen özel durumu bildiremez denetlenmeyen özel durumu
// bildirir.
class Parent {

	void msg() {

		System.out.println("parent");
	}
}

class TestExceptionChild extends
		Parent {

	void msg() throws IOException {
		// denetlenen durum bildirilemez

		System.out.println("TestExceptionChild");
	}
}

class TestExceptionChild1 extends
		Parent {

	void msg() throws ArithmeticException {
		// denetlenmeyen durum bildiriliebilir

		System.out.println("child");
	}
}

// If the superclass method declares an exception
// Üst sýnýfda throws tanýmlamasý yapýldýysa alt sýnýflarda throw tanýmlamasýnýn
// aynýsý veya tanýmlanan exceptionun alt sýnýflarý veya hiçbir throw
// tanýmlamasý yapýlmaz.
class Parent1 {

	void msg() throws ArithmeticException {

		System.out.println("parent");
	}
}

class TestExceptionChild2 extends
		Parent1 {

	void msg() throws Exception {

		System.out.println("child");
	}

	public static void main(String args[]) {

		Parent p = new TestExceptionChild2();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}

// alt ve ust sýnýf ayný throws tanýmlamasý
class Parent2 {

	void msg() throws Exception {

		System.out.println("parent");
	}
}

class TestExceptionChild3 extends
		Parent2 {

	void msg() throws Exception {

		System.out.println("child");
	}

	public static void main(String args[]) {

		Parent2 p = new TestExceptionChild3();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}

// Üst sýnýfdaki throws tanýmlamasýnýn alt sýnýflarýnda exception tanýmlamasýnýn
// alt sýnýflarý kullanýmý
class Parent3 {

	void msg() throws Exception {

		System.out.println("parent");
	}
}

class TestExceptionChild4 extends
		Parent3 {

	void msg() throws ArithmeticException {

		System.out.println("child");
	}

	public static void main(String args[]) {

		Parent3 p = new TestExceptionChild4();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}

// alt sýnýflarda throws tanýmlama olmadan kullanýmý
class Parent4 {

	void msg() throws Exception {

		System.out.println("parent");
	}
}

class TestExceptionChild5 extends
		Parent4 {

	void msg() {

		System.out.println("child");
	}

	public static void main(String args[]) {

		Parent4 p = new TestExceptionChild5();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}