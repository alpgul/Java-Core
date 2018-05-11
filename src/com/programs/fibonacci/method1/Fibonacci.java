package com.programs.fibonacci.method1;

public class Fibonacci {

	static int fib(int n) {

		if (n <= 1)
			return n;
		int x = fib(n - 1) + fib(n - 2);
		return x;
	}

	public static void main(String[] args) {

		int n = 9;
		System.out.println(fib(n));
	}

}
