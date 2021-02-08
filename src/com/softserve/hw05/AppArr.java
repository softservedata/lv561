package com.softserve.hw05;

public class AppArr {
	public static void main(String[] args) {
		int[] arr = { -3, 4, -1, -2, 5, -6, -7, 8, -10 };
		int position = -1;
		boolean isSecond = false;
		//
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] > 0) && isSecond) {
				position = i + 1;
				break;
			}
			if (arr[i] > 0) {
				isSecond = true;
			}
		}
		if (position == -1) {
			System.out.println("position not found");
		} else {
			System.out.println("position = " + position);
		}
	}
}
