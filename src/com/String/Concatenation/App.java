package com.String.Concatenation;

public class App {

	public static void main(String[] args) {

		String s = "Sachin" + " Tendulkar";
		// Java compiler transforms
		// String s=(new StringBuilder()).append("Sachin").append("
		// Tendulkar).toString();
		System.out.println(s);// Sachin Tendulkar
		String s1 = "Sachin ";
		String s2 = "Tendulkar";
		String s3 = s1.concat(s2);
		System.out.println(s3);// Sachin Tendulkar
	}
}
