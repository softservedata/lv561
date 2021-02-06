package com.softserve.edu.HW07;

import java.util.Arrays;

/*-
 * 
 * Enter 10 integer numbers.
 * Calculate the sum of first 5 elements if they are positive
 * or product of last 5 element in the other case.

 * 
 * @author Taras Ktasitskyi
 *
 */

public class ApplSumProd {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, -5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(arr));
		int idx = 5;
		
		int sum = 0;
		int prd = 1;
		boolean isSum = false;
		for (int i = 0; i < idx; i++) {
			isSum = false;
			if (arr[i] > 0) {
				sum = sum + arr[i];

			} else {
				for (int j = idx; j < arr.length; j++)
					prd = prd * arr[j];
				break;

			}
			isSum = true;

		}
		if (isSum)
			System.out.print("The sum of first 5 elements is: " + sum);
		else
			System.out.print("Product of last 5 element is: " + prd);

	}

}
