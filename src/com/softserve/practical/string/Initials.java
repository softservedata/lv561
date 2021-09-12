package com.softserve.practical.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Enter surname, name and patronymic on the console as a variable of type
 * String. Output on the console: surnames and initials name name, middle name
 * and last name
 * 
 * 
 * @author Taras Krasitskyi
 *
 */

public class Initials {

	public static void main(String[] args) {

		boolean check = true;
		String answer = "";
		String stringName = "";
		List<String> listNames = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
//-------------------Check input string-----------------------------------			
			do {
				System.out.print("\tInput Surname, Name, Patronymic: ");
				try {
					stringName = br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				String pattern = "[a-z \\-A-Z-]+";
				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(stringName);

				//System.out.println(m.matches());
				//System.out.println("\n" + stringName);
				try {
					if (m.matches()) {
						break;
					} else {
						m.reset();
						while (m.find()) {
							System.out.print(stringName.substring(m.start(), m.end()) + "*");
						}
						throw new IllegalArgumentException("Error! Unreachebl symbols.");

					}
				} catch (IllegalArgumentException e) {
					// TODO: handle exception
					System.out.println("\t\n" + e.getMessage() + " Try again.");
				}

			} while (true);

//--------------------end Check input string-----------------------------------------
//--------------------Input string to ArrayList--------------------------------------
			stringName += " ";
			int start = 0;
			int end = stringName.indexOf(" ", start);
			if (!listNames.isEmpty()) {
				listNames.clear();
			}
			while (end != -1) {
				listNames.add(stringName.substring(start, end));
				start = end + 1;
				end = stringName.indexOf(" ", start);

			}
//			for (String nm : listNames) {
//				System.out.println(nm);
//			}
//--------------------End Input string to ArrayList--------------------------------------	
//--------------------Print results------------------------------------------------------
			System.out.println("-----------------Results----------------");
			if ((listNames.get(1)).indexOf("-") == -1) {
				System.out.println(listNames.get(0) + " " + (listNames.get(1)).charAt(0) + ". "
						+ (listNames.get(2)).charAt(0) + ".");
			} else {
				String tmp = listNames.get(1);
				String tmpRes = tmp.charAt(0) + ".-" + tmp.charAt((listNames.get(1)).indexOf("-")+1) + ". ";
				System.out.println(listNames.get(0) + " " +tmpRes
						+ (listNames.get(2)).charAt(0) + ".");
			}
			
			System.out.println( listNames.get(1) +" "+ listNames.get(2) +" " + listNames.get(0));
			System.out.println("----------------------------------------");

//--------------------End Print results--------------------------------------------------
//--------------------Exit from program-----------------------------------------------
			System.out.print("\tDo you want continue? (y/n) ");
			do {
				try {
					answer = br.readLine().toLowerCase();
					if (answer.equals("y") || answer.equals("n")) {
						break;
					} else {
						throw new IllegalArgumentException("Error! Input \'y\' or \'n\'. ");
					}

				} catch (IOException | IllegalArgumentException e) {
					System.out.print("\t" + e.getMessage() + "Try again: ");
					// TODO: handle exception
				}
			} while (true);

			if (answer.equals("n")) {
				check = false;
				System.out.print("Task terminated!");
			}
//----------------------------------------------------------------			

		} while (check); // loop for run program

//---------Close input stream-------------------------------------
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//---------Close input stream-------------------------------------		
	}
}
