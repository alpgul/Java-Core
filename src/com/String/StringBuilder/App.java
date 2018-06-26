package com.String.StringBuilder;

public class App {

	public static void main(String[] args) {

		// StringBuilder append() method
		// StringBufferdan farký senkron deðildir.
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

		// StringBuilder insert() method
		StringBuilder sb1 = new StringBuilder("Hello ");
		sb1.insert(1, "Java");// now original string is changed
		System.out.println(sb1);// prints HJavaello

		// StringBuilder replace() method
		StringBuilder sb2 = new StringBuilder("Hello");
		sb2.replace(1, 3, "Java");
		System.out.println(sb2);// prints HJavalo

		// StringBuilder delete() method
		StringBuilder sb3 = new StringBuilder("Hello");
		sb3.delete(1, 3);
		System.out.println(sb3);// prints Hlo

		// StringBuilder reverse() method
		StringBuilder sb4 = new StringBuilder("Hello");
		sb4.reverse();
		System.out.println(sb4);// prints olleH

		// StringBuilder capacity() method
		StringBuilder sb5 = new StringBuilder();
		System.out.println(sb5.capacity());// default 16
		sb5.append("Hello");
		System.out.println(sb5.capacity());// now 16
		sb5.append("java is my favourite language");
		System.out.println(sb5.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

		// StringBuilder ensureCapacity() method
		StringBuilder sb6 = new StringBuilder();
		System.out.println(sb6.capacity());// default 16
		sb6.append("Hello");
		System.out.println(sb6.capacity());// now 16
		sb6.append("java is my favourite language");
		System.out.println(sb6.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb6.ensureCapacity(10);// now no change
		System.out.println(sb6.capacity());// now 34
		sb6.ensureCapacity(100);// now (34*2)+2
		System.out.println(sb6.capacity());// now 70

	}
}
