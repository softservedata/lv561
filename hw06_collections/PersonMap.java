package hw06_collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Homework Task #2.
 * Create map personMap and add to it ten people of type <String, String> (lastName, firstName).
 * Output the entities of the map on the screen.
 * Are there at least two people with the same firstName among these 10 people?
 * Remove from the map whose firstName is "Orest" (or another). Print result.
 */

public class PersonMap {

	public static void main(String[] args) {
		
		Map<String, String> personMap = new HashMap<>();	
		personMap.put("Petrenko", "Petro");
		personMap.put("Shevchenko", "Taras");
		personMap.put("Franko", "Ivan");
		personMap.put("Petrov", "Ivan");
		personMap.put("Dysa", "Kateryna");
		personMap.put("Gavrylenko", "Oleksandra");
		personMap.put("Ivanenko", "Oleksandr");
		personMap.put("Korzhyk", "Galyna");
		personMap.put("Prylypko", "Myroslava");
		personMap.put("Kozak", "Orest");
		
		for(Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println("lastName: " + entry.getKey() + " firstName: " + entry.getValue());
		}
		
		// check if there are at least two people with the same first name
		Collection<String> valuesList = personMap.values();
		Set<String> valuesSet = new HashSet<>(personMap.values());
		
		if(valuesList.size() == valuesSet.size()) {
			System.out.println("\nThere are no people with the same firstName");
		} else {
			System.out.println("\nThere are people with the same firstName");
		}
		
		// remove person with the name "Orest"
		for(Iterator<String> iter = personMap.values().iterator(); iter.hasNext();) {
			String s = iter.next();
			if(s.equals("Orest")) {
				iter.remove();
			}
		}
		
		System.out.println("\nAfter removal: ");
		for(Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println("lastName: " + entry.getKey() + " firstName: " + entry.getValue());
		}
		
	}
}
