package com.personal.concurrency;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TestCHM {

	public static void main(String[] args) throws InterruptedException {
		ConcurrentMap<String, String> conHashMap = new ConcurrentHashMap<>();
		PrintThread printThread  = new PrintThread(conHashMap);
		Thread myThread = null;
		boolean isPrinted = false;
		//printThread.start();
		for (int i = 0; i < 5550; i++) {
			myThread = new Thread(new MyThread(conHashMap, Thread.currentThread().getName()));
			myThread.start();
			if(!isPrinted)
				printThread.start();
			isPrinted = true;
		}
		myThread.join();
		System.out.println("map size ="+conHashMap.size());
		//printThread.start();
	}
}


class MyThread implements Runnable{

	ConcurrentMap<String, String> conHashMap;
	
	String threadName;
	
	public MyThread(ConcurrentMap<String, String> conHashMap, String threadName) {
		this.conHashMap = conHashMap;
		this.threadName = threadName;
	}
	@Override
	public void run() {
		conHashMap.putIfAbsent(Thread.currentThread().getName(), threadName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class PrintThread extends Thread{
	
	ConcurrentMap<String, String> conHashMap;
	
	public PrintThread(ConcurrentMap<String, String> conHashMap) {
		this.conHashMap = conHashMap;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Entry<String, String> entry : conHashMap.entrySet()) {
			System.out.println(entry.getKey()+":::"+entry.getValue());
		}
	}
}