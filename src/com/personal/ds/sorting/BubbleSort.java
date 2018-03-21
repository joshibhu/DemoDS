package com.personal.ds.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] myArr = {1,13,4,15,16,2,5,6,23,11,18};
		for (int i = 0; i < myArr.length; i++) {
			for (int j = i; j < myArr.length; j++) {
				if(myArr[j] < myArr[i]) {
					//swap
					int temp = myArr[j];
					myArr[j] = myArr[i];
					myArr[i] = temp;
				}
			}
		}
		//print it
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
	}
}
