package com.softserve.edu.HW07;

import java.util.Scanner;

/*-
 * 
 * Ask user to enter the number of month.
 * Read the value 
 * and write the amount of days in this month (create array with amount days of each month).

 * 
 * @author Taras Krasitskyi
 *
 */

public class MonthDay {
	
	public static void main(String[] args) {
		int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.print("Input the number of month: ");
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.nextLine());
		System.out.println("In this month is "+arr[m-1]+" days");
		sc.close();
		
		
	}

}
