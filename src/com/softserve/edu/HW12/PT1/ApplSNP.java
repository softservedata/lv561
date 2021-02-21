package com.softserve.edu.HW12.PT1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*-
 * Enter surname, name and patronymic on the console as a variable of type String.
 * 
 *  Output on the console:
	surnames and initials
	name
	name, middle name and last name

 * 
 * @author Taras Krasitskyi
 *
 */

public class ApplSNP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.print("Enter Surname: ");
		str += (sc.nextLine()).trim();
		System.out.print("Enter Name: ");
		str = str + " " + sc.nextLine().trim();
		System.out.print("Enter Patronymic: ");
		str = str + " " + sc.nextLine().trim();

		System.out.println(str);

		List<String> lst = new ArrayList<String>();
		
		int index = str.lastIndexOf(" ");
		lst.add(str.substring(index+1, str.length()));
		int start = 0;
		int in = 0;
		while (str.indexOf(" ", start) !=-1) {
			lst.add(in, str.substring(start,  str.indexOf(" ", start) )  );
			in++;
			start = str.indexOf(" ", start)+1;
			
		}
		
		/*for(String st:lst)
			System.out.print(st+":");
		 */
		
		//Output on the console:
		//surnames and initials
		//name
		//name, middle name and last name
		System.out.println("\tSurnames and Initials:");
		System.out.println(lst.get(0)+" "+(lst.get(1)).charAt(0)+". "+(lst.get(2)).charAt(0)+"." );
		System.out.println("--------------------------------------------");
		System.out.println("\tName:");
		System.out.println(lst.get(1));
		System.out.println("--------------------------------------------");
		System.out.println("\tName, Middle name and Last name:");
		System.out.println(lst.get(1)+" "+lst.get(2)+" "+lst.get(0) );
		System.out.println("--------------------------------------------");
		
		
	}

}
