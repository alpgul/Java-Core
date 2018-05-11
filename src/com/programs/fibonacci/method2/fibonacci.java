package com.programs.fibonacci.method2;

public class fibonacci {

	static int fib(int n) {

		int a = 0, b = 1, c;
		System.out.println(a + "\n" + b);
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
		return b;
	}

	public static void main(String args[]) {

		int n = 9;
		fib(n);
	}
}
