package com.document.abstract_class_and_interface;

/*
 * Abstract class vs Interface
1) Abstract class can have abstract and non-abstract methods.
<I>	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.
<I>	Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.
<I>	Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.
<I>	Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.
<I>	The interface keyword is used to declare interface.
6) An abstract classcan extend another Java class and implement multiple Java interfaces.
<I>	An interface can extend another Java interface only.
7) An abstract classcan be extended using keyword ?extends?.
<I>	An interface classcan be implemented using keyword ?implements?.
8) A Javaabstract classcan have class members like private, protected, etc.
<I>	Members of a Java interface are public by default.
9)Example:
public abstract class Shape{
public abstract void draw();
}	
<I>
Example:
public interface Drawable{
void draw();
}*/
public class App {

	public static void main(String args[]) {

		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}

// Creating interface that has 4 methods
interface A {

	void a();// bydefault, public and abstract

	void b();

	void c();

	void d();
}

// Creating abstract class that provides the implementation of one method of A
// interface
abstract class B implements
		A {

	public void c() {

		System.out.println("I am C");
	}
}

// Creating subclass of abstract class, now we need to provide the
// implementation of rest of the methods
class M extends
		B {

	public void a() {

		System.out.println("I am a");
	}

	public void b() {

		System.out.println("I am b");
	}

	public void d() {

		System.out.println("I am d");
	}
}

// Creating a test class that calls the methods of A interface
