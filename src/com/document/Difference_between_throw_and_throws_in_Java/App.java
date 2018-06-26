package com.document.Difference_between_throw_and_throws_in_Java;

/*
 * 	throw vs throws
1)	Java throw anahtar kelimesi bir istisnay� atamak i�in kullan�l�r.	
Java throws anahtar s�zc��� bir istisna ilan etmek i�in kullan�l�r.
2)	Kontrol edilen istisna alt ak��lara aktar�lamaz	
Kontrol edilen istisna  alt ak��lara aktar�l�r.
3)	Throw is followed by an instance.	
Throws is followed by class.
4)	Throw is used within the method.	
Throws is used with the method signature.*/
public class App {

	// Java throw example
	void m() {

		throw new ArithmeticException("sorry");
	}

	// Java throws example
	void m1() throws ArithmeticException {

		// method code
	}

	// Java throw and throws example
	void m2() throws ArithmeticException {

		throw new ArithmeticException("sorry");
	}
}
