package com.personal.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestExecutor {

	public static void main(String[] args) {
		ExecutorService execService = Executors.newCachedThreadPool();
		Future<String> response = execService.submit(new MyCallableThread());
		try {
			System.out.println(response.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyCallableThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("Callable method called !!");
		Thread.sleep(2000);
		return "success";
	}
	
}

