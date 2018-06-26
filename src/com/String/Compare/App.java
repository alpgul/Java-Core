package com.String.Compare;

public class App {

	public static void main(String[] args) {

		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false
		String s5 = "SACHIN";

		System.out.println(s1.equals(s5));// false
		System.out.println(s1.equalsIgnoreCase(s5));// true
		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)
		// False d�ner ��nk� == adresleri kontrol eder i� de�eri de�il
		System.out.println(s1.compareTo(s2));// e�it 0
		System.out.println(s1.compareTo(s3));// (s1)b�y�k 1(because s1>s3)
		System.out.println(s3.compareTo(s1));// (s3)k���k -1(because s3 < s1 )

	}
}
