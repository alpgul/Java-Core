package com.WrapperClass;

/*
 * Primitive Type	Wrapper class
	boolean				Boolean
	char				Character
	byte				Byte
	short				Short
	int					Integer
	long				Long
	float				Float
	double				Double
*/

public class App {

	public static void main(String args[]) {

		// Converting int into Integer
		int a = 20;
		Integer i = Integer.valueOf(a);// converting int into Integer
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally

		System.out.println(a + " " + i + " " + j);
		// Converting Integer to int
		Integer a1 = new Integer(3);
		int i1 = a1.intValue();// converting Integer to int
		int j1 = a1;// unboxing, now compiler will write a.intValue() internally

		System.out.println(a1 + " " + i1 + " " + j1);
	}
}
