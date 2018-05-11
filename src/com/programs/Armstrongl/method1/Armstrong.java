package com.programs.Armstrongl.method1;

public class Armstrong {

	public static void main(String[] args) {

		int c = 0, a, temp;
		int n = 153;// It is the number to check armstrong
		// 153 = (1*1*1)+(5*5*5)+(3*3*3)
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
	}
}
