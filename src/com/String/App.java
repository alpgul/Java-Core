package com.String;

public class App {

	public static void main(String[] args) {

		String s1 = "Welcome";
		String s2 = "Welcome";
		// will not create new instance
		String s = new String("Welcome");
		// creates two objects and one reference variable
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1) + "=adresleri ayný=" + System.identityHashCode(s2));
		String s4 = "java";// creating string by java string literal
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s5 = new String(ch);// converting char array to string
		String s6 = new String("example");// creating java string by new keyword
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
	}
}
