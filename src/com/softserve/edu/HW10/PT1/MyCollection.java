package com.softserve.edu.HW10.PT1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*-
 * 
 * Declare collection myCollection of 10 integers and fill it (from the console or random).
	Find and save in list newCollection all positions of element more than 5 in the collection.
	Print newCollection
	Remove from collection myCollection elements, which are greater then 20. Print result
	Insert elements 1, -3, -4 in positions 2, 8, 5.
	Print result in the format: Уposition Ц xxx, value of element Ц xxxФ
	Sort and print collection 

 * 
 * @author Taras Krasitskyi
 *
 */

public class MyCollection {

	public static void main(String[] args) {

		List<Integer> myCollection = new ArrayList<>();
		Random rnd = new Random();

		// System.out.println(myCollection.size());

		for (int i = 0; i < 10; i++) {
			myCollection.add(rnd.nextInt(50));
			// System.out.println(myCollection.size());
		}

		System.out.print("Print from *for*:");
		for (Integer current : myCollection) {
			System.out.print(current + " ");
		}

		System.out.print("\n");

		System.out.print("Print from *toString*: ");
		System.out.print(myCollection + "\n");

		System.out.println("Size of myCollection: " + myCollection.size());

		// Find and save in list newCollection all positions of element more than 5 in
		// the collection.

		List<Integer> newCollection = new ArrayList<>();

		int index = 0;// чи правильна реал≥зац≥ пошуку ≥ндекса елемента? чи Ї €к≥сь встроЇнн≥ методи
						// отримати ≥ндекс елемента current
		for (Integer current : myCollection) {
			if (current > 5) {
				newCollection.add(index);
			}
			index++;
		}
		
		// Print newCollection
		System.out.println("newCollection: " + newCollection);

		// Remove from collection myCollection elements, which are greater then 20.
		// Print result

		Iterator<Integer> itr = myCollection.iterator();
		while (itr.hasNext()) {
			if (itr.next() > 20) {
				
				itr.remove();
			}
		}
		System.out.print("myCollection after remove elemets greater then 20: " + myCollection + "\n");

		// Insert elements 1, -3, -4 in positions 2, 8, 5.
		

		if (myCollection.size() >= 2)
			myCollection.add(2, 1);
		else
			System.out.print("myCollection is to short. size of mycollection is: " + myCollection.size() + "\n");
		if (myCollection.size() >= 5)
			myCollection.add(5, -4);
		else
			System.out.print("myCollection is to short. size of mycollection is: " + myCollection.size() + "\n");
		if (myCollection.size() >= 8)
			myCollection.add(8, -3);
		else
			System.out.print("myCollection is to short. Element do not added size of myCollection is: " + myCollection.size() + "\n");
		
		// Print result in the format: Уposition Ц xxx, value of element Ц xxxФ
		index = 0;
		System.out.println("\nmyCollection : " );
		for (Integer current:myCollection) {
			System.out.println("position Ц "+ index+ " value of element Ц "+current);
			index++;
		}
		
		//Sort and print collection
		Collections.sort(myCollection);
		System.out.println("\nSorted myColection: "+myCollection);

	}

}
