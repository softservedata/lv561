package hw07_string;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Homework Task #2.
 * Enter a sentence that contains the words between more than one space. 
 * Convert all spaces, consecutive, one. 
 * 	For example, if we introduce the sentence "I    am      learning     Java   Core», 
 * 	we have to get the "I'm learning Java Core».
 */

public class Homework2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence with more than one space: ");
		String str = in.nextLine();
		in.close();
		 
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuffer sb = new StringBuffer();
		 
		while(st.hasMoreElements()) {
		    sb.append(st.nextElement()).append(" ");
		}
		 
		String newStr = sb.toString();		 
		System.out.println(newStr.trim());
				
	}
}
