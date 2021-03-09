package hw10_java8;

import java.util.ArrayList;
import java.util.List;

/*
 * Homework Task #1.
 * There is a list of strings list1.
 * Create a new list list2 that has items from list1 
 * and length less than 5 characters (use method removeIf).
 */
 
public class Homework1 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Katherine");
		names.add("George");
		names.add("Beverly");
		names.add("Mike");
		names.add("Yves");
		
		List<String> names2 = new ArrayList<>(names);
		
		names2.removeIf(n -> n.length() > 5);
		
		for(String s : names2) {
			System.out.println(s);
		}
			

	}

}
