package com.softserve.edu.HW06;

import java.util.Scanner;

/**
 * -
 * 
 * @author Taras Krasitskyi
 * 
 *         Enter the number of the day of the week. Display the name in three
 *         languages.
 *
 */

public class DayofWeek {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inpu number of week day:");
		switch (Integer.parseInt(sc.nextLine())) {
		case 1:
			System.out.println("Monday, " + "Montag, " + "Poniedziałek");
			break;
		case 2:
			System.out.println("Thusday, " + "Dienstag, " + "Wtorek");
			break;
		case 3:
			System.out.println("Whensday, " + "Mittwoch, " + "Sroda");
			break;
		case 4:
			System.out.println("Thursday, " + "Donnerstag, " + "Czwartek");
			break;
		case 5:
			System.out.println("Friday, " + "Freitag, " + "Piątek");
			break;
		case 6:
			System.out.println("Saturday, " + "Samstag, " + "Sobota");
			break;
		case 7:
			System.out.println("Sunday, " + "Sonntag, " + "Nedziela");
			break;
		default:
			System.out.println("Error!!!");
			sc.close();

		}

	}
}
