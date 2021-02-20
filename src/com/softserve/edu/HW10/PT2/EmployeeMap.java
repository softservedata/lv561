package com.softserve.edu.HW10.PT2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/*-
 * 
 * In the main() method declare map employeeMap of pairs <Integer, String>.
 * 
	Add to employeeMap seven pairs (ID, name) of some persons.
	Display the map on the screen.
	Ask user to enter ID, then find and write corresponding name from your map.
	If you can't find this ID - say about it to user (use function containsKey()).
	
	Ask user to enter name, verify than you have name in your map and write corresponding ID.
	If you can't find this name - say about it to user (use function containsValue()). 

 * 
 * @author Taras Krasitskyi
 *
 */
public class EmployeeMap {

	public static void main(String[] args) {
		// declare map employeeMap of pairs <Integer, String>
		Map<Integer, String> employeeMap = new HashMap<>();

		// Add to employeeMap seven pairs (ID, name) of some persons.
		employeeMap.put(1, "Mike");
		employeeMap.put(7, "Anna");
		employeeMap.put(3, "Bob");
		employeeMap.put(6, "Lily");
		employeeMap.put(5, "Anna");
		employeeMap.put(2, "Deive");
		employeeMap.put(4, "Robin");

		// Display the map on the screen.
		System.out.println("\tPrint employeeMap.toString: ");
		System.out.println("employeeMap: " + employeeMap);
		System.out.println("------------------------------------");
		//
		System.out.println("\tPrint employeeMap using Map.Entry<Integer, String> entry and employeeMap.entrySet(): ");
		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());

		}
		System.out.println("------------------------------------");
		//

		System.out.println(
				"\tPrint employeeMap using Iterator <Map.Entry<Integer,String>> itr = employeeMap.entrySet().iterator(): ");
		for (Iterator<Map.Entry<Integer, String>> itr = employeeMap.entrySet().iterator(); itr.hasNext();) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println("Key - " + entry.getKey() + ", Value - " + entry.getValue());

		}
		System.out.println("------------------------------------");

		// Ask user to enter ID, then find and write corresponding name from your map.
		System.out.print("Enter employee ID: ");
		Scanner sc = new Scanner(System.in);
		int id = Integer.parseInt(sc.nextLine());

		if (employeeMap.containsKey(id)) {
			String res = employeeMap.get(id);
			System.out.println("Employee ID " + id + " Name: " + res);
		} else
			System.out.println("No such ID - " + id + " in the Map!");

		System.out.println("------------------------------------");

		// Ask user to enter name, verify than you have name in your map and write
		// corresponding ID.
		// If you can't find this name - say about it to user (use function
		// containsValue()).
		System.out.print("Enter employee Name: ");
		String name = sc.nextLine();

		if (!employeeMap.containsValue(name))
			System.out.println("No such Name - " + name + " in the Map!");
		else {
			for (Iterator<Map.Entry<Integer, String>> itr = employeeMap.entrySet().iterator(); itr.hasNext();) {
				Map.Entry<Integer, String> element = itr.next();
				if ((element.getValue()).equals(name)) {
					System.out.println("Employee Name - " + name + ",ID - " + element.getKey());
				}

			}
		}
		sc.close();
		System.out.println("------------------------------------");
	}

}
