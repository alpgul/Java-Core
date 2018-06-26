package com.String.ToString;

public class App {

/*
 * Object sýnýfýnýn tostring methodunu override ederek geçersi klarak nesnenin deðerlerini döndürmemizi yarar*/
	public static void main(String args[]) {

		Student s1 = new Student(101, "Raj", "lucknow");
		Student s2 = new Student(102, "Vijay", "ghaziabad");

		System.out.println(s1);// compiler writes here s1.toString()
		System.out.println(s2);// compiler writes here s2.toString()
		/*com.String.ToString.Student@5f205aa
		com.String.ToString.Student@57fa26b7*/
		Student1 s3 = new Student1(101, "Raj", "lucknow");
		Student1 s4 = new Student1(102, "Vijay", "ghaziabad");

		System.out.println(s3);// compiler writes here s1.toString()
		System.out.println(s4);// compiler writes here s2.toString()
		/*101 Raj lucknow
		102 Vijay ghaziabad*/
	}
}

class Student {

	int rollno;

	String name;

	String city;

	Student(int rollno, String name, String city) {

		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}
}

class Student1 {

	int rollno;

	String name;

	String city;

	Student1(int rollno, String name, String city) {

		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public String toString() {// overriding the toString() method

		return rollno + " " + name + " " + city;
	}
}