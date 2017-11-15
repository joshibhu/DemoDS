package com.person.multithreading;

public class TestSynchronization {

	public static void main(String[] args) {
		Operation oper = new Operation();
		/*Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					oper.printX();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},"first");*/
		Thread t2 = new Thread(new Runnable() {
					
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					oper.printY();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},"second");
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					t2.interrupt();
					oper.printZ();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},"third");
		
		//t1.start();
		t2.start();
		t3.start();
	}
}


class Operation{
	String s1 = "s1";
	String s2 = "s2";
	public void printX() throws InterruptedException{
		System.out.println("X ::"+Thread.currentThread().getName());
		Thread.sleep(2000);
	}
	
	public void printY() throws InterruptedException{
		synchronized (s1) {
			System.out.println("Y ::"+Thread.currentThread().getName());
			Thread.sleep(2000);
		}
	}
	
	public void printZ() throws InterruptedException{
		synchronized (s1) {
			System.out.println("Z ::"+Thread.currentThread().getName());
			Thread.sleep(2000);
		}
	}
}