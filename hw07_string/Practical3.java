package hw07_string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Practice Task #3.
 * The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores. 
 * Using regular expressions implement checking the user name for validity. 
 * Input five names in the main method. 
 * Output a message to the console of the validation of each of the entered names.
 */
public class Practical3 {
	public static void main(String[] args) {
		
		String pattern = "[a-zA-Z_0-9]{3,15}";
		Pattern p = Pattern.compile(pattern);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter username: ");
		String str1 = in.nextLine();
				
		Matcher m1 = p.matcher(str1);
		if(m1.matches()) {
			System.out.println("Valid username");
		} else {
			System.err.println("Not valid username");
		}
		
		System.out.print("\nEnter another username: ");
		String str2 = in.nextLine();
		in.close();
				
		Matcher m2 = p.matcher(str2);
		if(m2.matches()) {
			System.out.println("Valid username");
		} else {
			System.err.println("Not valid username");
		}
		
	}
}
