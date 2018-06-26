package com.Synchronization.reentrant_monitor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App2 {

	private int count = 0;

	private Lock lock = new ReentrantLock();

	private Lock lock1 = new ReentrantLock();

	// private Condition cond = lock.newCondition();

	private void increment() throws InterruptedException {

		// System.out.println("begin" + count);
		for (int i = 0; i < 10000; i++) {
			count++;
		}
		// System.out.println("end" + count);
	}

	public void firstThread() throws InterruptedException {

		lock.lock();
		System.out.println("Thread 1 çalýþýyor...");
		// condition.await();
		System.out.println("Thread 1 devam ediyor...");
		try {
			increment();
		} finally {
			lock.unlock();

		}
	}

	public void secondThread() throws InterruptedException {

		lock.lock();
		Thread.sleep(1000);
		System.out.println("Thread 2 çalýþýyor...");
		System.out.print("Devam etmek için 'Enter'a basýnýz: ");
		// new Scanner(System.in ). nextLine ();
		// condition.signal ();
		System.out.println("Thread 2 devam ediyor...");
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void finished() {

		System.out.println("Count is: " + count);
	}

	public static void main(String[] args) {

		App2 test = new App2();
		App2 test1 = new App2();
		Thread t1 = new Thread() {

			public void run() {

				try {
					test.firstThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
		Thread t2 = new Thread() {

			public void run() {

				try {
					test.secondThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t2.start();
	}
}