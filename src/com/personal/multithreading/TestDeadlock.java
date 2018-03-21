package com.personal.multithreading;

import java.util.Observable;
import java.util.Observer;

public class TestDeadlock implements Observer {

	private String s1;
	
	private String s2;
	
	Thread t1 = new Thread( new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (s1) {
				System.out.println("Got the lock on S1. Trying to hold S2 !!");
				synchronized (s2) {
					System.out.println("Achieved by "+Thread.currentThread().getName());
				}
				
			}
		}
	});
	
	Thread t2 = new Thread( new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (s2) {
				System.out.println("Got the lock on S2. Trying to hold S1 !!");
				synchronized (s1) {
					System.out.println("Achieved by"+Thread.currentThread().getName());
				}
				
			}
		}
	});
	
	public static void main(String[] args) throws InterruptedException {
		TestDeadlock td = new TestDeadlock();
		td.s1 = "abc";
		td.s2 = "xyz";
		td.t1.start();
		td.t2.start();
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
