package com.softserve.hw0;

import java.util.Scanner;

public class Appl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nums = ");
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Result:");
		for (int num : nums) {
			System.out.print(num + "   ");
		}
	}
}
