package com.personal.concurrency;

import java.util.ArrayList;
import java.util.List;

// Own implementation of blocking queue
public class BlockingQueue<E> {
	
	List<E> queue = new ArrayList<>();
	
	int limit;
	
	public BlockingQueue(int limit) {
		this.limit = limit;
	}

	public synchronized void enqueue(E obj) throws InterruptedException{
		while(limit == queue.size()) {
			wait();
		}
		if(limit == 0) {
			notifyAll();
		}
		queue.add(obj);
		limit++;
	}
	
	public synchronized E dequeue() throws InterruptedException{
		while(queue.size() == 0) {
			wait();
		}
		if(limit == queue.size()) {
			notifyAll();
		}
		return queue.remove(0);
		
	}
}
