package com.Faq.String;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		// How many objects will be created in the following code?
		String s1 = "javatpoint";
		String s2 = "javatpoint";
		// Answer:1

		// What is the difference between equals() method and == operator?
		// Answer:Equals String deðeri == deðere ait referans deðerlerini kontrol eder

		// Is String class final?
		// Answer:Yes(immutable)

		// How to reverse String in java?
		System.out.println(App.reverseString("my name is comp"));
		System.out.println(App.itReverseString("my name is comp1"));

		// How to check Palindrome String in java?
		System.out.println(App.isPalindrome("nitin"));
		System.out.println(App.isPalindrome("jatin"));

		// Write a java program to capitalize each word in string?
		System.out.println(App.capitalizeWord("I am sonoo jaiswal"));

		// Write a java program to reverse each word in string?
		System.out.println(App.reverseWord("my name is khan"));

		// How to optimize string creation?
		long startTime = System.currentTimeMillis();
		// tek nesne oluþur
		for (int i = 0; i < 100000; i++) {
			String str1 = "Turkey";
			String str2 = "Turkey";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken to create literal String : " + (endTime - startTime) + " ms");
		long startTime1 = System.currentTimeMillis();
		// her defasýnda 2 nesne oluþur
		for (int i = 0; i < 100000; i++) {
			String str1 = new String("Turkey");
			String str2 = new String("Turkey");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken to create Object String : " + (endTime1 - startTime1) + " ms");

		// Java Program to check whether two Strings are anagram or not
		isAnagram("Keep", "Peek");
		isAnagram("Mother In Law", "Hitler Woman");

		// Java program to find the percentage of uppercase, lowercase, digits and
		// special characters in a string
		charPercentage("Turkey is my country 100%");

		// Java Program to find duplicate characters in a String
		findIt("Turkey is my country");

		// Java Program to prove that strings are immutable in java
		String st1 = "Java";
		String st2 = "Java";
		System.out.println("Before Modification in st1");
		referenceCheck(st1, st2);
		st1 += "ava";
		System.out.println("After Modification");
		referenceCheck(st1, st2);

		// Java Program to remove all white spaces from a String
		String str = "Turkey     Is My    Country";
		// 1st way
		String noSpaceStr = str.replaceAll("\\s", ""); // using built in method
		System.out.println(noSpaceStr);
		// 2nd way
		char[] strArray = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				stringBuffer.append(strArray[i]);
			}
		}
		String noSpaceStr2 = stringBuffer.toString();
		System.out.println(noSpaceStr2);

		// Write a Java program to count the number of words in a string?
		String string = "    Turkey Is My Country";
		System.out.println(wordcount(string) + " words.");

		// How do you swap two string variables without using third or temp variable in
		// java?
		String a = "Love";
		String b = "You";
		System.out.println("Before swap: " + a + " " + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After : " + a + " " + b);

		// How to remove a particular character from a string ?
		String str1 = "Turkey is my country";
		System.out.println(charRemoveAt(str1, 7));
	}

	// By StringBuilder / StringBuffer
	public static String reverseString(String str) {

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	// By Reverse Iteration
	public static String itReverseString(String str) {

		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}

	// PalindromeChecker
	public static boolean isPalindrome(String str) {

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

	// StringFormatter
	public static String capitalizeWord(String str) {

		String words[] = str.split("\\s");
		String capitalizeWord = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			capitalizeWord += first.toUpperCase() + afterfirst + " ";
		}
		return capitalizeWord.trim();
	}

	// reverseWord
	public static String reverseWord(String str) {

		String words[] = str.split("\\s");
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		return reverseWord.trim();
	}

	// AnagramString
	static void isAnagram(String str1, String str2) {

		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

	// CharacterPercentage
	static void charPercentage(String input) {

		int totalChar = input.length();
		int upperCase = 0;
		int lowerCase = 0;
		int digits = 0;
		int others = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCase++;
			} else if (Character.isLowerCase(ch)) {
				lowerCase++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				others++;
			}
		}
		double upperCaseLetterPercentage = (upperCase * 100) / totalChar;
		double lowerCaseLetterPercentage = (lowerCase * 100) / totalChar;
		double digitsPercentage = (digits * 100) / totalChar;
		double otherCharPercentage = (others * 100) / totalChar;

		DecimalFormat format = new DecimalFormat("##.##");
		System.out.println("In '" + input + "' : ");
		System.out.println("Uppercase letters are " + format.format(upperCaseLetterPercentage) + "% ");
		System.out.println("Lowercase letters are " + format.format(lowerCaseLetterPercentage) + "%");
		System.out.println("Digits Are " + format.format(digitsPercentage) + "%");
		System.out.println("Other Characters Are " + format.format(otherCharPercentage) + "%");

	}

	// DuplicateCharFinder
	public static void findIt(String str) {

		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		for (Character ch : charArray) {
			if (baseMap.containsKey(ch)) {
				baseMap.put(ch, baseMap.get(ch) + 1);
			} else {
				baseMap.put(ch, 1);
			}
		}
		Set<Character> keys = baseMap.keySet();
		for (Character ch : keys) {
			if (baseMap.get(ch) > 1) {
				System.out.println(ch + "  is " + baseMap.get(ch) + " times");
			}
		}
	}

	public static void referenceCheck(Object x, Object y) {

		if (x == y) {
			System.out.println("Both pointing to the same reference");

		} else {
			System.out.println("Both are pointing to different reference");
		}
	}

	// WordCount
	static int wordcount(String string) {

		int count = 0;

		char ch[] = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			ch[i] = string.charAt(i);
			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
				count++;
		}
		return count;
	}

	public static String charRemoveAt(String str, int p) {

		return str.substring(0, p) + str.substring(p + 1);
	}
}
