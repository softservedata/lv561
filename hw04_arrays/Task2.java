package hw04_arrays;

import java.util.Scanner;

/*
 * Task 2. Enter 10 integer numbers.
 * Calculate the sum of the first 5 elements if they are positive
 * or product of last 5 elements in the other case.
 */

public class Task2 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		int sum = 0;
		int product = 1;

		System.out.println("Enter 10 numbers: ");
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}
		in.close();

		for (int i = 0; i < nums.length - 5; i++) {
			if (nums[i] > 0) {
				sum += nums[i];
			} else {
				for (i = 5; i < nums.length; i++) {
					product *= nums[i];
				}
			}
		}

		System.out.println("sum = " + sum);
		System.out.println("product = " + product);

	}

}
