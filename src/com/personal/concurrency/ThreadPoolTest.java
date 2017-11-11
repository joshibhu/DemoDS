package com.personal.concurrency;

public class ThreadPoolTest {

	public static void main(String[] args) {
		ThreadPool threadPool = new ThreadPool(5, 20);
		try {
			for (int i = 0; i < 20; i++) {
				threadPool.execute(new Task(i));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Task implements Runnable{

	private int taskNumber;
	public Task(int taskNumber) {
		// TODO Auto-generated constructor stub
		this.taskNumber = taskNumber;
	}
	
	@Override
	public void run() {
		System.out.println("Task number ::"+taskNumber + " started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Task number ::"+taskNumber + " closed");
	}
}
