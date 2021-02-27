package hw07_string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Homework Task #1.
 * Enter in the console sentence of five words. 
 * 	-> display the longest word in the sentence;
 * 	-> determine the number of its letters;
 * 	-> bring the second word in reverse order.
 */
public class Homework1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter sentence of five words: ");
		String str = in.nextLine();
		in.close();
		
		String[] arr = str.split(" ");
		
		String word = arr[1];
		StringBuilder input = new StringBuilder();
		input.append(word);
		input.reverse();
		System.out.println("Second word reversed: " + input);
		
		Arrays.sort(arr, new java.util.Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        return s2.length() - s1.length();
		    }
		});		
		System.out.println("The longest word is: " + arr[0] + 
				"\n\tand it has " + arr[0].length() + " letters");
		
	}
}
