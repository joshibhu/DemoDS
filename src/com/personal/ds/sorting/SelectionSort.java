package com.personal.ds.sorting;

public class SelectionSort {

	/**
		arr[] = 64 25 12 22 11
	
		// Find the minimum element in arr[0...4]
		// and place it at beginning
		11 25 12 22 64
	
		// Find the minimum element in arr[1...4]
		// and place it at beginning of arr[1...4]
		11 12 25 22 64
	
		// Find the minimum element in arr[2...4]
		// and place it at beginning of arr[2...4]
		11 12 22 25 64
	
		// Find the minimum element in arr[3...4]
		// and place it at beginning of arr[3...4]
		11 12 22 25 64 
	*/
	public static void main(String[] args) {
		int[] myArr = {1,13,4,15,16,2,5,6,23,11,18};
		for (int i = 0; i < myArr.length; i++) {
			int min = i;
			for (int j = i; j < myArr.length; j++) {
				if(myArr[j] < myArr[min]) {
					min = j;
				}
			}
			//swap
			int temp = myArr[i];
			myArr[i] = myArr[min];
			myArr[min] = temp;
		}
		
		//print it
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
	}
}
