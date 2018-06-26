package com.document.Performing_multiple_Task;

public class App {

}

// Birden çok iþ parçacýðýyla tek görevi nasýl gerçekleþtirilir?
// Her thread ayrý run methodu çaðrýmý yýgýnýnda çalýþýr.
class TestMultitasking1 extends
		Thread {

	public void run() {

		System.out.println("task one");
	}

	public static void main(String args[]) {

		TestMultitasking1 t1 = new TestMultitasking1();
		TestMultitasking1 t2 = new TestMultitasking1();
		TestMultitasking1 t3 = new TestMultitasking1();

		t1.start();
		t2.start();
		t3.start();
	}
}

class TestMultitasking2 implements
		Runnable {

	public void run() {

		System.out.println("task one");
	}

	public static void main(String args[]) {

		Thread t1 = new Thread(new TestMultitasking2());// passing annonymous object of TestMultitasking2 class
		Thread t2 = new Thread(new TestMultitasking2());

		t1.start();
		t2.start();

	}
}

// Birden çok threadle çoklu görevler nasýl gerçekleþtirilir (çoklu iþ
// parçacýðýnda çoklu görevler)?
class Simple1 extends
		Thread {

	public void run() {

		System.out.println("task one");
	}
}

class Simple2 extends
		Thread {

	public void run() {

		System.out.println("task two");
	}
}

class TestMultitasking3 {

	public static void main(String args[]) {

		Simple1 t1 = new Simple1();
		Simple2 t2 = new Simple2();

		t1.start();
		t2.start();
	}
}

// by annonymous class
class TestMultitasking4 {

	public static void main(String args[]) {

		Thread t1 = new Thread() {

			public void run() {

				System.out.println("task one");
			}
		};
		Thread t2 = new Thread() {

			public void run() {

				System.out.println("task two");
			}
		};

		t1.start();
		t2.start();
	}
}

// by annonymous class that implements Runnable interface
class TestMultitasking5 {

	public static void main(String args[]) {

		Runnable r1 = new Runnable() {

			public void run() {

				System.out.println("task one");
			}
		};

		Runnable r2 = new Runnable() {

			public void run() {

				System.out.println("task two");
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}