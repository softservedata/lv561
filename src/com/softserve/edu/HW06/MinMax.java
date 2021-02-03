package com.softserve.edu.HW06;

import java.util.Scanner;

/**
 * read 3 integer numbers and write max and min of them;
 * 
 * @author Taras Krasirskyi
 */

public class MinMax {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Num: ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("Input Num: ");
		b = Integer.parseInt(sc.nextLine());
		System.out.print("Input Num: ");
		c = Integer.parseInt(sc.nextLine());
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		System.out.println("Maximum is: " + max);
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		System.out.println("Minimum is: " + min);
		sc.close();


	}

}
