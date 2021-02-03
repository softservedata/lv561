package hw04_arrays;

import java.util.Scanner;

/*
 * Task 1. Ask user to enter the number of month. 
 * Read the value and write the amout of days in this month
 * (create array with amount days of each month).
 */

public class Task1_Month {
	public static void main(String[] args) {

		int[] days = { 31, 28, 30 };

		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of month: ");
		int mon = in.nextInt();
		in.close();

		switch (mon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("This month has " + days[0] + " days");
			break;
		case 2:
			System.out.println("This month has " + days[1] + " days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:	
			System.out.println("This month has " + days[2] + " days");
			break;
		default:
			System.out.println("Invalid data");
		}

	}

}
