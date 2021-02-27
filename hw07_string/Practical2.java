package hw07_string;

import java.util.Scanner;

/*
 * Practice Task #2. 
 * Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
 * 	-> surnames and initials, 
 * 	-> name, 
 * 	-> name middle name and last name.
 */

public class Practical2 {	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter surname, name and patronymic: ");
		String str = in.nextLine();
		in.close();
		
		String[] arr = str.split(" ");
		System.out.println("\tSurname and initials: " + "\n" + arr[0] + " " + arr[1].charAt(0) + "." + arr[2].charAt(0) + ".");
		System.out.println("\tName: " + "\n" + arr[1]);
		System.out.println("\tName, middle name and last name: " + "\n" + arr[1] + " " + arr[2] + " " + arr[0]);
			
	}
}
