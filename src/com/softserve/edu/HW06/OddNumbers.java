package com.softserve.edu.HW06;

import java.util.Scanner;

/**
 * -
 * 
 * @author Taras Krasitskui
 * 
 *         Enter three numbers. Find out how many of them are odd.
 *
 * 
 */

public class OddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number 1: ");
		int a1 = Integer.parseInt(sc.nextLine());
		System.out.print("Input Number 2: ");
		int a2 = Integer.parseInt(sc.nextLine());
		System.out.print("Input Number 3: ");
		int a3 = Integer.parseInt(sc.nextLine());
		sc.close();
		int count = 0;
		if (a1 % 2 != 0)
			count++;
		if (a2 % 2 != 0)
			count++;
		if (a3 % 2 != 0)
			count++;
		System.out.println("There are " + count + " odd number.");

	}

}
