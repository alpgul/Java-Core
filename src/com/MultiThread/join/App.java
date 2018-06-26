package com.MultiThread.join;

/*Join: Bir iþ parçacýðýnýn ölmesini bekler*/
class TestJoinMethod1 extends
		Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {

		TestJoinMethod1 t1 = new TestJoinMethod1();
		TestJoinMethod1 t2 = new TestJoinMethod1();
		TestJoinMethod1 t3 = new TestJoinMethod1();
		t1.start();
		try {// t1 threadi olene kadar bekliyecektir.
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}

class TestJoinMethod2 extends
		Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {

		TestJoinMethod2 t1 = new TestJoinMethod2();
		TestJoinMethod2 t2 = new TestJoinMethod2();
		TestJoinMethod2 t3 = new TestJoinMethod2();
		t1.start();
		try {// t1 threadi olene kadar bekliyecek ama belirtilen süre kadar süre dolduðunda
				// devam edecektir. Süreden önce ölürse yine devam edecektir.
			t1.join(1500);
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}

// getName(),setName(String) and getId() method:
class TestJoinMethod3 extends
		Thread {

	public void run() {

		System.out.println("running...");
	}

	public static void main(String args[]) {

		TestJoinMethod3 t1 = new TestJoinMethod3();
		TestJoinMethod3 t2 = new TestJoinMethod3();
		System.out.println("Name of t1:" + t1.getName());
		System.out.println("Name of t2:" + t2.getName());
		System.out.println("id of t1:" + t1.getId());

		t1.start();
		t2.start();

		t1.setName("Sonoo Jaiswal");
		System.out.println("After changing name of t1:" + t1.getName());
	}
}

// The currentThread() method:

class TestJoinMethod4 extends
		Thread {

	public void run() {

		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String args[]) {

		TestJoinMethod4 t1 = new TestJoinMethod4();
		TestJoinMethod4 t2 = new TestJoinMethod4();

		t1.start();
		t2.start();
	}
}