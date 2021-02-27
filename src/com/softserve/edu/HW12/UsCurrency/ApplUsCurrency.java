package com.softserve.edu.HW12.UsCurrency;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.*;

/*-
 * Implement a pattern for US currency:
 * the first symbol "$",
 * then any number of digits,
 * dot and two digits after the dot.
 * Enter the text from the console that contains several occurrences of US currency.
 * Display all occurrences on the screen.

 * 
 * @author Taras Krasitskyi
 *
 */

public class ApplUsCurrency {
	

	public static void main(String[] args) {
		String pattern = "^\\$(\\d+)(\\.\\d{2}$)";
		Pattern p = Pattern.compile(pattern);
		List <String> lst = new ArrayList<>();
		lst.add("$12369.02");
		lst.add("12369.02");
		lst.add("$12369.2");
		lst.add("$1236,02");
		lst.add("$.02");
		lst.add("$12369");
		lst.add("$12369.");
		lst.add("$12 369.02");
		
		List<String> isValid = new ArrayList<>();
		List<String> notValid = new ArrayList<>();
		for (String curr : lst) {
			if(p.matcher(curr).matches()) {
				isValid.add(curr);
			}else notValid.add(curr);
		}
		System.out.println("\tValid Us curency: ");
		for(String curr: isValid)
			System.out.println(" - "+curr);
		System.out.println("\tNot Valid Us curency: ");
		for(String curr: notValid)
			System.out.println(" - "+curr);
		
	}

}
