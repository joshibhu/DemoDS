package com.personal.serialization;

public class TestException {

	public static void main(String[] args) {
		call(10);
	}
	
	/*public static void call(Integer a) {
		System.out.println("Integer");
	}*/
	
	/*public static void call(Number a) {
		System.out.println("Number");
	}*/
	
	public static void call(Object a) {
		System.out.println("Object");
	}
}
