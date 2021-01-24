
package com.softserve.edu.lesson1.task2;

import java.util.Scanner;
/**
 * 
 * @author Taras Krasitskyi
 * Task2 for Lesson1
 * input/output simple text
 *
 */
public class Task2 {
	public static void main (String [] args) {
		System.out.println("How are you?");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine();
		System.out.println("You are "+answer);
		sc.close();
	}

}
