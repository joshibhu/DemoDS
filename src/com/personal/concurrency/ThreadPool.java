package com.personal.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {

	private BlockingQueue<Runnable> taskQueue = null; 
	
	private List<PoolThread> poolThreadList = new ArrayList<>();
	
	private boolean isStopped = false;

	public ThreadPool(int threadCount, int queueCapacity) {
		this.taskQueue = new ArrayBlockingQueue<>(queueCapacity);
		for (int i = 0; i < threadCount; i++) {
			poolThreadList.add(new PoolThread(taskQueue));
		}
		for (PoolThread poolThread : poolThreadList) {
			poolThread.start();
		}
	}
	
	public void execute(Runnable task) throws InterruptedException {
		if(isStopped) {
			throw new IllegalStateException("Threal Pool is stopped");
		}
		taskQueue.put(task);
	}
	
	public void stop() throws InterruptedException {
		isStopped = true;
		for (PoolThread poolThread : poolThreadList) {
			poolThread.doStop();
		}
	}
	
}

class PoolThread extends Thread{
	
	private BlockingQueue<Runnable> taskQueue = null; 
	
	private boolean isStopped = false;
	
	public PoolThread(BlockingQueue<Runnable> taskQueue) {
		this.taskQueue = taskQueue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!isStopped()) {
			try {
				Runnable task = taskQueue.take();
				task.run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public synchronized void doStop() {
		this.isStopped = true;
	}
	
	public synchronized boolean isStopped(){
        return isStopped;
    }
}
