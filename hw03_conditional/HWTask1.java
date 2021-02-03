package hw03_conditional;

import java.util.Scanner;

/*
 * Homework task 1. 
 * Read 3 float numbers and check: are they all belong to the range [-5,5]. 
 * Read 3 integer numbers and write max and min of them.
 */

public class HWTask1 {

	public static void main(String[] args) {

		// read 3 integers and write max and min of them

		System.out.print("Enter first number: ");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.print("Enter second number: ");
		int num2 = in.nextInt();
		System.out.print("Enter third number: ");
		int num3 = in.nextInt();

		int tempMax = num1 > num2 ? num1 : num2;
		int resultMax = num3 > tempMax ? num3 : tempMax;

		System.out.println("The max number is: " + resultMax);

		int tempMin = num1 < num2 ? num1 : num2;
		int resultMin = num3 < tempMin ? num3 : tempMin;

		System.out.println("The min number is: " + resultMin);

		// read 3 floats and check: do they all belong to the range [-5,5]

		System.out.print("Enter first float: ");
		float n1 = in.nextFloat();
		System.out.print("Enter second float: ");
		float n2 = in.nextFloat();
		System.out.print("Enter third float: ");
		float n3 = in.nextFloat();
		in.close();

		if (n1 < 5 && n1 > -5) {
			if (n2 < 5 && n2 > -5) {
				if (n3 < 5 && n3 > -5) {
					System.out.println("Yes, all numbers belong to the range [-5,5]");
				} else {
					System.out.println("No, not all numbers belong to the range [-5,5]");
				}
			} else {
				System.out.println("No, not all numbers belong to the range [-5,5]");
			}
		} else {
			System.out.println("No, not all numbers belong to the range [-5,5]");
		}

	}

}
