package com.ExceptionHandling.throws_key;

import java.io.IOException;

public class App {

	// Java throws example
	// �stisnai hata f�rlat�m�nda alt ak��lara hatayi iletmek i�in kullan�lan
	// keyworddur.
	void m() throws IOException {

		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {

		m();
	}

	void p() {

		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {

		App obj = new App();
		obj.p();
		System.out.println("normal flow...");
		try {
			M m = new M();
			m.method();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}

}

// Case1: You handle the exception
// e�er istisnai durum meyadana gelmezse do�ru �al���r
class M {

	void method() throws IOException {

		throw new IOException("device error");
	}
}

// Case2: You declare the exception e�er istisnai durum meyada gelirse �al��ma
// zaman�nda hata f�rlat�r
class M1 {

	void method() throws IOException {

		throw new IOException("device error");
	}
}

class Testthrows4 {

	public static void main(String args[]) throws IOException {// declare exception

		M1 m = new M1();
		m.method();

		System.out.println("normal flow...");
	}
}