package com.switchExample;

public class App {

	public static void main(String[] args) {

/*Java Switch Statement*/
		int number = 20;
		switch (number) {
			case 10:
				System.out.println("10");
				break;
			case 20:
				System.out.println("20");
				break;
			case 30:
				System.out.println("30");
				break;
			default:
				System.out.println("Not in 10, 20 or 30");
		}// 20
/*Java Switch Statement is fall-through*/
		int number1 = 20;
		switch (number1) {
			case 10:
				System.out.println("10");
			case 20:
				System.out.println("20");
			case 30:
				System.out.println("30");
			default:
				System.out.println("Not in 10, 20 or 30");
		}
		/*
		* 20
		* 30
		* Not in 10, 20 or 30
		*/
	}
}
