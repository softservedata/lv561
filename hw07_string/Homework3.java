package hw07_string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Homework Task #3. 
 * Implement a pattern for US currency: 
 * 	the first symbol "$", then any number of digits, dot and two digits after the dot. 
 * Enter the text from the console that contains several occurrences of US currency. 
 * Display all occurrences on the screen.
 */

public class Homework3 {
	public static void main(String[] args) {
		
		String pattern = "^\\$" // start string with dollar sign
				+ "((([1-9]\\d*)?\\d))" // 1 or more digits where the first digit is 0 only if it's the only digit
				+ "(\\.\\d\\d){1}$"; // obligatory two digits after dot
		
		Pattern p = Pattern.compile(pattern);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter several occurences of US currency: ");
		String str = in.nextLine();
		in.close();
		
		System.out.println("\nMatched occurences: ");
		String[] arr = str.split(" ");
		for(String s : arr) {
			Matcher m = p.matcher(s);
			if(m.matches()) {
				System.out.print(s + "\n");
			}
		}
		
	}
}
