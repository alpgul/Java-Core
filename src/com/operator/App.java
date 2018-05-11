package com.operator;

public class App {

	public static void main(String[] args) {

/* Java Unary Operator Example: ++ and -- */
		int x = 10;
		System.out.println(x++);// 10(11)
		System.out.println(x--);// 11(10)
		System.out.println(++x);// 11
		System.out.println(--x);// 10
/* Java Unary Operator Example 2: ++ and -- */
		int a1 = 10;
		int b1 = 10;
		System.out.println(a1++ + ++a1);// 10+12=22
		System.out.println(b1++ + b1++);// 10+11=21
/* Java Unary Operator Example: ~ and ! */
		int a = 10;
		int b = -10;
		boolean c = true;
		boolean d = false;
		System.out.println(~a);// -11 (minus of total positive value which
								// starts from 0)
		System.out.println(~b);// 9 (positive of total minus, positive starts
								// from 0)
		System.out.println(!c);// false (opposite of boolean value)
		System.out.println(!d);// true
/* Java Arithmetic Operator Example */
		int a2 = 10;
		int b2 = 5;
		System.out.println(a2 + b2);// 15
		System.out.println(a2 - b2);// 5
		System.out.println(a2 * b2);// 50
		System.out.println(a2 / b2);// 2
		System.out.println(a2 % b2);// 0
/* Java Arithmetic Operator Example: Expression */
		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2); // 21
/* Java Left Shift Operator Example */
		System.out.println(10 << 2);// 10*2^2=10*4=40
		System.out.println(10 << 3);// 10*2^3=10*8=80
		System.out.println(20 << 2);// 20*2^2=20*4=80
		System.out.println(15 << 4);// 15*2^4=15*16=240
/* Java Right Shift Operator Example */
		System.out.println(10 >> 2);// 10/2^2=10/4=2
		System.out.println(20 >> 2);// 20/2^2=20/4=5
/* Java Shift Operator Example: >> vs >>> */
		// For positive number, >> and >>> works same
		System.out.println(20 >> 2);
		System.out.println(20 >>> 2);
		// For negative number, >>> changes parity bit (MSB) to 0
		System.out.println(-20 >> 2);
		System.out.println(-20 >>> 2);
		System.out.println(20 >> 3);// 20/2^3=20/8=2
/*
 * Java AND Operator Example: Logical && and Bitwise & 
 * &: her koþullar ne olursa olsun tüm koþullarý kontrol eder 
 * &&:koþullarý sýrasýyla kontrol eder eðer false donerse diðer koþullara bakmaz
 */
		int a3 = 10;
		int b3 = 5;
		int c3 = 20;
		System.out.println(a3 < b3 && a3 < c3);
		// false && true = false ilk koþul bakýldý false olduðu
		// için diðer koþul a3 < c3 bakýlmadý
		System.out.println(a3 < c3 & a3 < b3); // false & true = false
/*Java AND Operator Example 2: Logical && vs Bitwise &*/
		int a4 = 10;
		int b4 = 5;
		int c4 = 20;
		System.out.println(a4 < b4 && a4++ < c4);// false && true = false
		System.out.println(a4);// 10 because second condition is not checked
		System.out.println(a4 < b4 & a4++ < c4);// false && true = false
		System.out.println(a4);// 11 because second condition is checked
/*Java OR Operator Example: Logical || and Bitwise |
 * ||:birinci koþul doðru ise diðer koþullara bakýlmaz
 * |:tüm koþullar bakýlýr.*/
		int a5 = 10;
		int b5 = 5;
		int c5 = 20;
		System.out.println(a5 > b5 || a5 < c5);// true || true = true
		System.out.println(a5 > b5 | a5 < c5);// true | true = true
		// || vs |
		System.out.println(a5 > b5 || a5++ < c5);// true || true = true
		System.out.println(a5);// 10 because second condition is not checked
		System.out.println(a5 > b5 | a5++ < c5);// true | true = true
		System.out.println(a5);// 11 because second condition is checked
/*Java Ternary Operator Example*/
		int a6 = 2;
		int b6 = 5;
		int min = (a6 < b6) ? a6 : b6;
		System.out.println(min);// 2
		int a7 = 10;
		int b7 = 5;
		int min1 = (a7 < b7) ? a7 : b7;
		System.out.println(min1);// 5
/*Java Assignment Operator Example*/
		int a8 = 10;
		a8 += 3;// 10+3
		System.out.println(a8);
		a8 -= 4;// 13-4
		System.out.println(a8);
		a8 *= 2;// 9*2
		System.out.println(a8);
		a8 /= 2;// 18/2
		System.out.println(a8);
/*Java Assignment Operator Example: Adding short*/
		short a9 = 10;
		short b9 = 10;
		a9 += b9;// a=a+b internally so fine
		// a9 = a9 + b9;// Compile time error because 10+10=20 now int
		System.out.println(a9);
		short a10 = 10;
		short b10 = 10;
		a = (short) (a10 + b10);// 20 which is int now converted to short
		System.out.println(a);

	}
}
