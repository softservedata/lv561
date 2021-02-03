package hw04_arrays;

/*
 * Practice Task 1.
 * Create an array of ten integers. 
 * Display:
 * 	- the biggest of these numbers;
 * 	- the sum of positive nubmers in the array;
 * 	- the amount of negative numbers in the array;
 * 
 * What values are more: negative or positive?
 */
public class PracticeTask1 {

	public static void main(String[] args) {
		
		int[] arr = {10, -35, 53, 89, -43, 4, 67, -89, 234, 90};
		
		// getthing the max value from the array
		
		int i = 0; 
		int max = arr[0];
		
		for(i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}		
		System.out.println("max = " + max);
		
		// calculating the sum of positive numbers
		int sum = 0;
		
		for(i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				sum += arr[i];
			}
		}
		System.out.println("sum of positive numbers = " + sum);
		
		// getting the amount of positive and negative numbers
		int countNeg = 0, countPos = 0;
		
		for(i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				countNeg++;
			} else if(arr[i] > 0) {
				countPos++;
			}
		}
		System.out.println("amount of negative numbers = " + countNeg);
		
		// finding out: what values are more ?
		
		if(countNeg > countPos) {
			System.out.println("There are more negative numbers than positive ones");
		} else if (countPos > countNeg) {
			System.out.println("Thera are more positive numbers than negative ones");
		} else {
			System.out.println("The amount of positive and negative numbers is equal");
		}
		
	}

}
