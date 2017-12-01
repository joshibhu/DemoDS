package com.personal.java8;

public class Basics {

	
	public static void main(String[] args) {
		Basics sl = new Basics();
		sl.greet.foo();
	}
	Greet greet = () -> {
		System.out.println("HelloWorld!");
		System.out.println("Learn Lamda");
	};
}

interface Greet{
	void foo();
}

