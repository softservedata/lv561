package hw03_conditional;

import java.util.Scanner;

/*
 * Practice Task 1. 
 * Enter three numbers.
 * Find out how many of them are odd.
 */

public class PracticeTask1 {

		public static void main(String[] args) {
			
			int[] array = new int[3];
			int oddNums = 0;
			
			System.out.println("Enter three numbers: ");
			Scanner in = new Scanner(System.in);
			for(int i = 0; i < array.length; i++) {
				array[i] = in.nextInt();
			}
			in.close();
			
		    for(int i = 0; i < array.length; i++) {
		        if(array[i] % 2 != 0) {         
		          oddNums++;
				}			
		    }                 
			System.out.printf("\nNumber of odd numbers: %d", oddNums);
			System.out.printf("\n");

	}

}
