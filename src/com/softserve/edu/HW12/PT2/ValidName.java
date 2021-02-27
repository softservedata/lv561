package com.softserve.edu.HW12.PT2;

import java.util.regex.*;



/*-
 * The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
 * Using regular expressions implement checking the user name for validity. 
 * Input five names in the main method . 
 * Output a message to the console of the validation of each of the entered names.

 * 
 * @author Tatas Krasitskyi
 *
 */

public class ValidName {

	public void validName(String text) {
		/*-
		 * public static boolean checkWithRegExp(String userNameString){
          Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
          Matcher m = p.matcher(userNameString);
          return m.matches();
      } 
		 */

		String pattern = "^[a-z_0-9-]{3,15}$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		if(m.matches())
			System.out.println("The name is valid!");
		else 
			System.out.println("The name is Not valid!");
		
		
	}

}
