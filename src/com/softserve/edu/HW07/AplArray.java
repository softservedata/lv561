package com.softserve.edu.HW07;
/*-
 * 
 * Create an array of ten integers. Display 
	the biggest of these numbers;
	the sum of positive numbers in the array;
	the amount of negative numbers in the array.
    What values there are more: negative or positive?

 * @author Taras Krasitskyi
 *
 */

public class AplArray {

	public static void main(String[] args) {
		int[] arr = { 9, 1, 0, -6, 12, 3, -7, 8, 6, -2 };
		System.out.print("Array: [");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]\n");
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Biggest number is: " + max);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0)
				sum = sum + arr[i];
		}
		System.out.println("The sum of positive numbers in the array is: " + sum);

		int ammount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 && arr[i] != 0)
				ammount = ammount + 1;
		}

		System.out.println("The amount of negative numbers in the array: " + ammount);

		int positiv = 0;
		int negative = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 && arr[i] != 0)
				positiv++;
			else
				negative++;
		}
		if (positiv > negative)
			System.out.println(
					"Positive values are more! " + positiv + " positive values and " + negative + " negative values");
		else
			System.out.println("Negative values are more! " + negative + " values and " + positiv + " values");

	}

}
