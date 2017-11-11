package com.personal.ds;

public class SingleLinkedList {

	static int i;
	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();
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

