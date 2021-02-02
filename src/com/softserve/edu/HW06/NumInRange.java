package com.softserve.edu.HW06;

import java.util.Scanner;

/**
 * read 3 float numbers and check: are they all belong to the range [-5,5];
 * 
 * @author Taras Krasitskyi
 *
 */

public class NumInRange {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float a = 0;
		float b = 0;
		float c = 0;
		System.out.print("Input Num: ");
		a = Float.parseFloat(sc.nextLine());
		System.out.print("Input Num: ");
		b = Float.parseFloat(sc.nextLine());
		System.out.print("Input Num: ");
		c = Float.parseFloat(sc.nextLine());
		sc.close();

		if (a >= -5 && a <= 5) {
			System.out.println(a + " is in the range  [-5;5]");
		}
		else System.out.println(a + " not belong the range  [-5;5]");
		if (b >= -5 && b <= 5) {
			System.out.println(b + " is in the range  [-5;5]");
		}
		else System.out.println(b + " not belong the range  [-5;5]");
		if (c >= -5 && c <= 5) {
			System.out.println(c + " is in the range  [-5;5]");
		}
		else System.out.println(c + " not belong the range  [-5;5]");

	}

}
