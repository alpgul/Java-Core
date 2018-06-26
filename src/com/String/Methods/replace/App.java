package com.String.Methods.replace;

public class App {

	public static void main(String[] args) {

		// Java String replace(char old, char new) method example
		String s1 = "javatpoint is a very good website";
		String replaceString = s1.replace('a', 'e');// replaces all occurrences of 'a' to 'e'
		System.out.println(replaceString);
		// Java String replace(CharSequence target, CharSequence replacement) method
		// example
		String s2 = "My name is Khan. My name is Bob. My name is Sonoo.";
		String replaceString1 = s2.replace("is", "was");// replaces all occurrences of "is" to "was"
		System.out.println(replaceString1);
	}

}
