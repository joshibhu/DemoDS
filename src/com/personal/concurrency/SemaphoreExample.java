package com.personal.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Printing odd/even numbers by different threads...");
		Semaphore cb = new Semaphore(2);
		Thread t1 = new Thread(new Even(cb));
		Thread t2 = new Thread(new Odd(cb));
		t1.start();
		Thread.sleep(1000);
		t2.start();
	}
}

class Even implements Runnable{

	Semaphore cb;
	
	public Even(Semaphore cb) {
		// TODO Auto-generated constructor stub
		this.cb = cb;
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 100; i+=2) {
			System.out.println(i);
			try {
				cb.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Odd implements Runnable{

	Semaphore cb;
	
	public Odd(Semaphore cb) {
		// TODO Auto-generated constructor stub
		this.cb = cb;
	}
	@Override
	public void run() {
		for (int i = 1; i < 100; i+=2) {
			cb.release();
			System.out.println(i);
		}
	}
	
}
