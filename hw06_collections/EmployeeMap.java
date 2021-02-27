package hw06_collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Practice Task #2. 
 * 	In the main() method declare map employeeMap of pairs <Integer, String>.
 * 	Add to employeeMap seven pairs (ID, name) of some people. Display the map.
 * 	Ask user to enter ID, then find and write corresponding name from your map.
 * 		If you cannot find this ID - say this to the user (use function containsKey()).
 * 	Ask user to enter name, verify then if you have the name in your map and write corresponding ID.
 * 		If you cannot find this name - say this to the user (use function containsValue()).
 *  
 */

public class EmployeeMap {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		// declaring employeeMap with seven pairs
		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(701, "Ivan");
		employeeMap.put(702, "Petro");
		employeeMap.put(703, "Galyna");
		employeeMap.put(704, "Myroslav");
		employeeMap.put(705, "Anna");
		employeeMap.put(706, "Kateryna");
		employeeMap.put(707, "Mykola");
		
		for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			System.out.println("id: " + entry.getKey() + " name: " + entry.getValue());
		}
		
		// check for id
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter ID: ");
		int id = Integer.parseInt(bf.readLine());
						
		for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			if(employeeMap.containsKey(id)) {
				System.out.println("Employee exists. Name: " + entry.getValue());
				break;
			} else {
				System.err.println("Ivalid data or employee doesn't exist");
				break;
			}
		}
		
		// check for name
		System.out.print("Enter name: ");
		String name = bf.readLine();
		
		for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			if(employeeMap.containsValue(name)) {
				System.out.println("Employee exists. ID: " + entry.getKey());
				break;
			} else {
				System.err.println("Ivalid data or such ID doesn't exist");
				break;
			}
		}
		
		bf.close();
		
	}
}
