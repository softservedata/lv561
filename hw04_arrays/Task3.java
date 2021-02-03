package hw04_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Task 3. Enter 5 integer numbers. Find:
 *  - position of second positive nubmer;
 *  - minimum and its position in the array.
 *  Organize entering integers until the first negative number.
 *  Count the product of all entered even numbers.
 */

public class Task3 {

	public static void main(String[] args) {
		
		// loop to enter 5 integer numbers and to find the min value

		int[] nums = new int[5];
		int min = Integer.MAX_VALUE;

		System.out.println("Enter 5 numbers: ");
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) { 
			nums[i] = in.nextInt();
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		in.close();
		System.out.println("Original Array: " + Arrays.toString(nums));

		// loop to find index of the min value
		
		int indexMin = min;
		for (int i = 0; i < nums.length; i++) { 
			if (nums[i] == min) {
				indexMin = i;
				break;
			}
		}

		System.out.println("Min value = " + min + " at index = " + indexMin);

		// loop to find the index of the second positive number
		
		for (int i = 0; i < nums.length - 1; i++) { 
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] > 0) && (nums[j] > 0)) {
					i += 3;
					System.out.println("Index of the second positive is = " + j);
					break;
				}
			}
		}
		
		// loop to calculate product of even numbers

		int product = 1;
		for (int i = 0; i < nums.length; i++) { 
			if (nums[i] % 2 == 0) {
				product *= nums[i];
			}
		}
		System.out.println("product = " + product);
		
		// loop to find the index of first negative number,
		// which is necessary for the next loop

		int tmp;
		int t = 0;
		for (int i = 0; i < nums.length; i++) { 
			if (nums[i] < 0) {
				t = i;
				break;
			}
		}

		// loop, which uses index from the previous loop, 
		// to sort array until the first negative number
		
		for (int i = 0; i < t; i++) { 
			if (nums[i] > 0) {
				for (i = 0; i < t; i++) {
					for (int j = 0; j < t - 1 - i; j++) {
						if (nums[j] > nums[j + 1]) {
							tmp = nums[j];
							nums[j] = nums[j + 1];
							nums[j + 1] = tmp;
						}
					}
				}
			} else if (nums[i] < 0) {
				break;
			}
		}

		System.out.println("\nOrganized integers: " + Arrays.toString(nums));

	}

}
