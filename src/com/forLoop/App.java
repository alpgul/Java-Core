package com.forLoop;

public class App {

	public static void main(String[] args) {

/*Java Simple For Loop*/
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
		// 1 2 3 4 5 6 7 8 9 10
/*Java for-each Loop*/
		int arr[] = { 12, 23, 44, 56, 78 };
		for (int i : arr) {
			System.out.println(i);
		}
		// 12 23 44 56 78
/*Java Labeled For Loop*/
		aa: for (int i = 1; i <= 3; i++) {
			bb: for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					break aa;
				}
				System.out.println(i + " " + j);
			}
		}
		// 1 1-1 2-1 3-2 1
		aa: for (int i = 1; i <= 3; i++) {
			bb: for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					break bb;
				}
				System.out.println(i + " " + j);
			}
		}
		// 1 1-1 2-1 3-2 1-1 1-1 2-1 3-2 1-3 1-3 2-3 3
/*Java Break Statement with Loop*/
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
/*Java Break Statement with Inner Loop*/
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					break;
				}
				System.out.println(i + " " + j);
			}
		}
/*Java Continue Statement Example*/
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
/*Java Infinitive For Loop*/
		for (;;) {
			System.out.println("infinitive loop");
		}
		/*
		 * infinitive loop
		* infinitive loop
		* infinitive loop
		* infinitive loop
		* infinitive loop
		* ctrl+c*/

	}

}
