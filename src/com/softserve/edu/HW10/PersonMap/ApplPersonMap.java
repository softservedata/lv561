package com.softserve.edu.HW10.PersonMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*-Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
	Output the entities of the map on the screen. 
	There are at less two persons with the same firstName among these 10 people?
	Remove from the map person whose firstName is ”Orest” (or other). Print result.  

 * 
 * @author Taras Krasitskyi
 *
 */

public class ApplPersonMap {

	public static void main(String[] args) {
		// Create map personMap and add to it ten persons of type <String, String>
		// (lastName, firstName).
		Map<String, String> personMap = new HashMap<>();
		personMap.put("Golovatyi", "Volodymyr");
		personMap.put("Lysyk", "Andriy");
		personMap.put("Grynyshyn", "Nazar");
		personMap.put("Roman", "Uliana");
		personMap.put("Pavlyshyn", "Zoriana");
		personMap.put("Mykoliv", "Nazar");
		personMap.put("Mineev", "Ruslan");
		personMap.put("Fedorovych", "Yaroslav");
		personMap.put("Sviata", "Uliana");
		personMap.put("Trushchak", "Nazar");

		// Output the entities of the map on the screen.
		System.out.println("\tPrint tpersonMap using toString:");
		System.out.println(personMap);
		System.out.println("-------------------------------------");
		//
		System.out.println("\tPrint tpersonMap using for(Map.Entry<String, String> entry: personMap.entrySet())  ");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println("Last Name: " + entry.getKey() + "\tFirst Name: " + entry.getValue());

		}
		System.out.println("-------------------------------------");
		//
		System.out.println(
				"\tPrint tpersonMap using for (Iterator<Map.Entry<String, String>> it = personMap.entrySet().iterator(); it.hasNext();)  ");
		for (Iterator<Map.Entry<String, String>> it = personMap.entrySet().iterator(); it.hasNext();) {
			Map.Entry<String, String> element = it.next();
			System.out.println("Last Name: " + element.getKey() + "\tFirst Name: " + element.getValue());

		}
		System.out.println("-------------------------------------");

		// There are at less two persons with the same firstName among these 10 people?

		List<String> firstName = new ArrayList<>(personMap.values());

		Set<String> names = new HashSet<>();
		for (int i = 0; i < firstName.size() - 1; i++) {
			for (int j = i + 1; j < firstName.size(); j++) {
				if (firstName.get(i).equals(firstName.get(j))) {
					names.add(firstName.get(i));

				}
			}
		}
		System.out.println("\tPersons with the same firstName among these 10 people");
		for (String nm : names)
			for (Map.Entry<String, String> entry : personMap.entrySet()) {
				if (entry.getValue().equals(nm)) {
					System.out.println("Last Name: " + entry.getKey() + "\tFirst Name: " + entry.getValue());
				}
			}
		System.out.println("-------------------------------------");
		
		//Remove from the map person whose firstName is ”Orest” (or "Nazar"). Print result.
		for (Iterator<Map.Entry<String, String>> it = personMap.entrySet().iterator(); it.hasNext();) {
			Map.Entry<String, String> element = it.next();
			if (element.getValue().equals("Nazar")) {
				it.remove();

			}
		}
		System.out.println("\tAll records with First Name \"Nazar\" was removed!");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println("Last Name: " + entry.getKey() + "\tFirst Name: " + entry.getValue());

		}
		System.out.println("-------------------------------------");
	}

}
