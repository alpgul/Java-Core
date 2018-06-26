package com.String.Methods.split;

//public String split(String regex, int limit)  
public class App {

	public static void main(String[] args) {

		// Java String split() method example
		// regex ifadeye göre strin ifadeyi bölme
		String s1 = "java     string split method by javatpoint";
		String[] words = s1.split("(\\s)+");// splits the string based on whitespace
		// using java foreach loop to print elements of string array
		for (String w : words) {
			System.out.println(w);
		}

		// Java String split() method with regex and length example

		String s2 = "welcome to split world";
		System.out.println("returning words:");
		// s2.split("\\s", 0)==s2.split("\\s")
		for (String w : s2.split("\\s", 0)) {
			System.out.println(w);
		}
		System.out.println("returning words:");
		// tek satýr
		for (String w : s2.split("\\s", 1)) {
			System.out.println(w);
		}
		System.out.println("returning words:");
		// 2 satýr
		for (String w : s2.split("\\s", 2)) {
			System.out.println(w);
		}
	}
}
