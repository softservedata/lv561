package com.softserve.edu.HW07;

import java.util.Scanner;

/*-
 * 
 * Enter 5 integer numbers.
 *  Find position of second positive number;
	minimum and its position in the array.
	Organize entering integers until the first negative number. Count the product of all entered even numbers.

 * 
 * @author Taras Krasitskyi
 *
 */

public class Task3 {

	public static void main(String[] args) {

		int[] arr = { -1, 3, -2, 5, 7 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
//			Find position of second positive number;
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				tmp = tmp + 1;
			if (tmp == 2) {
				System.out.println("\nIndex of second positive numberis: " + i + " Position: " + (i + 1));
				break;
			}
		}
//		minimum and its position in the array.
		tmp = arr[0];
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (tmp > arr[i]) {
				tmp = arr[i];
				idx = i;
			}
		}
		
		
		System.out.println("Minimum is: " + tmp + " Position is: " + idx);

//		Organize entering integers until the first negative number. Count the product of all entered even numbers.
		tmp = 0;
		idx = 0;
		for (int i = 0; i <arr.length ; i++) {
			arr[i] = 0;
		}
		
				
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Input element: ");
			tmp = Integer.parseInt(sc.nextLine());
			if (tmp > 0) {
				arr[i] = tmp;
				idx  = idx+1;
			} else
				break;
		}
		
		int prod = 1;
		for(int i = 0;i<idx;i++) {
			prod = prod*arr[i];
			
		}
		
		System.out.println("Product of all entered numbers: "+prod);
		sc.close();
	}

}
