package com.personal.multithreading;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		Queue<Integer> myqueue = new ArrayBlockingQueue<>(10);
		Thread t1 = new Thread(new Producer(myqueue));
		Thread t2 = new Thread(new Consumer(myqueue));
	}
}

class Producer implements Runnable{

	Queue<Integer> queue;
	
	public Producer(Queue<Integer> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		
	}
	
}

class Consumer implements Runnable {

	Queue<Integer> queue;
	
	public Consumer(Queue<Integer> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		
	}
	
}
