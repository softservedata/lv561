package com.softserve.hw05;

public class AppNum {
	public static void main(String[] args) {
		int[] arr = { -3, 4, -1, -2, 5, -6, -7, 8, -10 };
		int countEven = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEven++;
				if (countEven == 4) {
					System.out.println("countEven = " + countEven + "  element = " + arr[i]);
				}
			}
		}
		System.out.println("countEven = " + countEven);
	}
}
