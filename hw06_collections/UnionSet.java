package hw06_collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Homework Task #1.
 * 	Write parameterized methods union (Set set1, Set set2) and intersect(Set set1, Set set2), 
 * 		realizing the operations of union and intersection of two sets.
 * 	Test the operation of these techniques on two pre-filled sets.
 */

public class UnionSet {

	public static void main(String[] args) {
	
		Set<Integer> set1 = Set.of(1, 2, 3, 4, 5);
		Set<Integer> set2 = Set.of(1, 7, 5, 8, 9);
		
		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		
		// union
		Set<Integer> result = new HashSet<>(set1);
		result.addAll(set2);
		System.out.println("Union: " + result);
		
		// intersection
		Set<Integer> result2 = new HashSet<>(set1);
		result2.retainAll(set2);
		System.out.println("Intersection: " + result2);
		
	}
}
