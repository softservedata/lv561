package hw07_string;

import java.util.Scanner;

/*
 * Practice Task #1. 
 * Enter two variables of type String.
 * Determine whether the first variable substring second.
 * For example, if you typed "IT" and "IT Academy" you must receive true.
 */

public class Practical1 {	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1 = in.nextLine();
		System.out.print("Enter second string: ");
		String str2 = in.nextLine();
		in.close();
		
		System.out.println(str2.contains(str1));

	}
}
