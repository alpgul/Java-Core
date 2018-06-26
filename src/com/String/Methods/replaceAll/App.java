package com.String.Methods.replaceAll;

//public String replaceAll(String regex, String replacement)  
public class App {

	public static void main(String[] args) {

		// replace methoddan farki regex kullanabilmemiz
		// replaceFirst ve replaceall regex kullanabilir
		// Java String replaceAll() example: replace character
		String s1 = "javatpoint is a very good website";
		String replaceString = s1.replaceAll("a", "e");// replaces all occurrences of "a" to "e"
		System.out.println(replaceString);

		// Java String replaceAll() example: replace word
		String s2 = "My name is Khan. My name is Bob. My name is Sonoo.";
		String replaceString1 = s2.replaceAll("is", "was");// replaces all occurrences of "is" to "was"
		System.out.println(replaceString1);

		// Java String replaceAll() example: remove white spaces
		String s3 = "My name is Khan. My name is Bob. My name is Sonoo.";
		String replaceString2 = s3.replaceAll("\\s", "");
		System.out.println(replaceString2);
	}
}
