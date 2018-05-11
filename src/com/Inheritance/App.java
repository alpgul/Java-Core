package com.Inheritance;

class Employee {

	float salary = 40000;
}

class App extends
		Employee {

	int bonus = 10000;

	public static void main(String args[]) {

		App p = new App();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
	}
}
