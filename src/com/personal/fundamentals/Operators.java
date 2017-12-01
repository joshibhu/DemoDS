package com.personal.fundamentals;

public class Operators {

	public static void main(String[] args) {
		//unary not (~) operator
		System.out.println(~15);
		/**
		 * 4 = 0000.....0100
		 * ~4 = 1(this represent negative hence have to do 2's compliment of rest)111....1011
		 *    = 1000....0100
		 *    = 1000....0100 + 1 = 1000....0101 = -5
		 */
		//bitwise XOR (^)
		System.out.println(5^1);
		/**
		 * 101^001 = 100 (if same then 0 otherwise 1)
		 */
		// signed shift right (>>2) :: either skip 2 last bits OR shift by 2 bits to right
		System.out.println(-15>>2);
		/**
		 * 8>>2 = 1000 >> 2 = 10 OR 0010  = 2
		 * 15>>2 = 1111 >> 2 = 11 OR 0011 = 3
		 * -15>>2 = -4
		 * -15 = +15th 2's compliment (~ + 1)  = 1111...10001
		 * -15>>2 = 1111....11100 (removed last 2 as it is signed so 1 is added twice at left most)
		 * 1111...11100 2's compliment = 100.....00100 = -4
		 */
		// shift left(<<2) :: add 2 zero at the right
		System.out.println(8<<2);
		/**
		 * 8<<2 = 1000 << 2 = 100000 = 32
		 */
		//unsigned shift right (>>>)
		/**
		 * >>> ::  behavior is same in case of positive number
		 * >>> :: in case of negative number the left most 1 will be shifted right and the bits will be replaced by 0
		 * that will make a very large number
		 */
		System.out.println(-15>>>2);
		
		
	}
}
