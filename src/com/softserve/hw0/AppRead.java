package com.softserve.hw0;

import java.util.Scanner;

public class AppRead {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		int n = 0;
		do {
			System.out.print("n = ");
			try {
				n = Integer.parseInt(sc.nextLine());
				isValid = true;
			} catch (Exception e) {
				System.out.println("Error: invalid data");
			}
		} while (!isValid);
		System.out.println("res: n = " + n);
	}
}
