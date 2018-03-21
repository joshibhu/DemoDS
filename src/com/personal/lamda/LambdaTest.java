package com.personal.lamda;

public class LambdaTest {

	public static void main(String[] args) {
		MyNumber myNumber;
		myNumber = (int n) -> (n%2 == 0);
		myNumber = (n) -> (n >= 0);
		System.out.println("Number 5 is even ="+myNumber.checkEven(5));
	}
	
}
