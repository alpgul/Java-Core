package com.ExceptionHandling.propagation;

public class App {

	// Program of Exception Propagation
	// Eðer exception yakalanamazsa hata bir alt çaðrýma düþer
	void m() {

		int data = 50 / 0;
	}

	void n() {

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
		obj.p1();
		System.out.println("normal flow");
	}

	// Kontrollü hata fýrlatma alt akýþlara aktarýmý yapýlamaz
	void m1() {

		throw new java.io.IOException("device error");// checked exception
	}

	void n1() {

		m1();
	}

	void p1() {

		try {
			n1();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}
}
