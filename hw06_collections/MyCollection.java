package hw06_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Practice Task #1. 
 * 	Declare collection myCollection of 10 integers and fill it (from the console or random)
 * 	-> Find and save in list newCollection all positions of element more than 5 in the collection
 * 	-> Remove from collection myCollection elements, which are greater than 20. Print result
 * 	-> Instert elements 1, -3, -4 in positions 2, 8, 5. 
 * 		Print result in the format: "position - xxx, value of element - xxx"
 * 	-> Sort and print collection
 */

public class MyCollection {

	public static void main(String[] args) {		
		
		// declaring myCollection with 10 random integers
		List<Integer> myCollection = new ArrayList<>() {{
											add(new Random().nextInt(50));
											add(new Random().nextInt(50));
											add(new Random().nextInt(50));
											add(new Random().nextInt(50));
											add(new Random().nextInt(50));
											add(new Random().nextInt(50));
											add(new Random().nextInt(50));
											add(new Random().nextInt(50));
											add(new Random().nextInt(50));
											add(new Random().nextInt(50));			
		}};		
		System.out.println("myCollection: " + myCollection.toString());
		
		// finding and saving to newCollection positions of integers more than 5
		List<Integer> newCollection = new ArrayList<>();
		
		for(int i = 0; i < myCollection.size(); i++) {
			if(myCollection.get(i) > 5) {
				newCollection.add(i);
			}
		}
		System.out.println("newCollection: " + newCollection.toString());
		
		// inserting new elements to the collection
		myCollection.set(2, 1);
		myCollection.set(8, -3);
		myCollection.set(5, -4);
		
		for(int i = 0; i < myCollection.size(); i++) {
			System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
		}
		
		// removing elements greater than 20
		Iterator<Integer> iter = myCollection.iterator();
		while(iter.hasNext()) {
			Integer i = iter.next();
			if(i > 20) {
				iter.remove();
			}
		}
		System.out.println("Greater than 20 removed: " + myCollection);
		
		// sorting and printing collection
		Collections.sort(myCollection);
		System.out.println("Sorted: " + myCollection);
		

	}
}
