package com.softserve.practical.string;

import java.util.Scanner;

/**
 * Enter the two variables of type String. Determine whether the first variable
 * substring second. For example, if you typed «IT» and «IT Academy» you must
 * receive true.
 * 
 * 
 * @author Taras Krasitskyi
 *
 */

public class SubString {

	public static void main(String[] args) {

		String str1 = "";
		String str2 = "";
		String answer = "";
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		do {

			System.out.print("\tInput first string: ");
			str1 = sc.next();
			System.out.print("\tInput second string: ");
			str2 = sc.next();
			System.out.println("Second string contains First string: " + str2.contains(str1));
			
			System.out.print("\tDo you want continue? (y/n) ");
			do {
				try {
					answer = (sc.next()).toLowerCase();
					if (answer.equals("n") || answer.equals("y")) {
						break;

					} else {
						throw new IllegalArgumentException("Error! Input \'y\' or \'n\'. ");
					}

				} catch (IllegalArgumentException e) {
					System.out.print("\t"+e.getMessage() + "Try again: ");

				}
			} while (true);

			if (answer.equals("n")) {
				check = false;
				System.out.print("Task terminated!");
			}

		} while (check);
		sc.close();
	}

}
