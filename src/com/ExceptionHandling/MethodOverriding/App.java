package com.ExceptionHandling.MethodOverriding;

import java.io.IOException;

public class App {

	public static void main(String args[]) {

		Parent p = new TestExceptionChild();
		p.msg();
	}
}

// �st s�n�f y�ntemi bir istisna bildirmezse, alt s�n�f ge�ersiz k�lma
// y�ntemi, denetlenen �zel durumu bildiremez denetlenmeyen �zel durumu
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
// �st s�n�fda throws tan�mlamas� yap�ld�ysa alt s�n�flarda throw tan�mlamas�n�n
// ayn�s� veya tan�mlanan exceptionun alt s�n�flar� veya hi�bir throw
// tan�mlamas� yap�lmaz.
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

// alt ve ust s�n�f ayn� throws tan�mlamas�
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

// �st s�n�fdaki throws tan�mlamas�n�n alt s�n�flar�nda exception tan�mlamas�n�n
// alt s�n�flar� kullan�m�
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

// alt s�n�flarda throws tan�mlama olmadan kullan�m�
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