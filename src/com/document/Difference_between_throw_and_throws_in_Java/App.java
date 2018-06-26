package com.document.Difference_between_throw_and_throws_in_Java;

/*
 * 	throw vs throws
1)	Java throw anahtar kelimesi bir istisnayý atamak için kullanýlýr.	
Java throws anahtar sözcüðü bir istisna ilan etmek için kullanýlýr.
2)	Kontrol edilen istisna alt akýþlara aktarýlamaz	
Kontrol edilen istisna  alt akýþlara aktarýlýr.
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
