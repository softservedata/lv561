package com.softserve.practical.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implement a pattern for US currency: the first symbol "$", then any number of
 * digits, dot and two digits after the dot. Enter the text from the console
 * that contains several occurrences of US currency. Display all occurrences on
 * the screen.
 * 
 * @author Taras Krasitskyi
 *
 */

public class USCurrency {

	public static boolean checkUSCurrency(String currencyUS) {
		String pattern = "\\$(\\d+)(\\.\\d{2})";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(currencyUS);
		return m.matches();
	}

	public static void main(String[] args) {
		String inputString = "";
		String inputAnswer = "";
		boolean check = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("\tInput currency: ");
			try {
				inputString = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(inputString + ": " + USCurrency.checkUSCurrency(inputString));

			do {
				System.out.print("\tDo you want continue(y/n): ");
				try {
					inputAnswer = br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				try {
					if (!inputAnswer.toLowerCase().equals("y") && !inputAnswer.toLowerCase().equals("n")) {
						throw new IllegalArgumentException("Bad answer! try again: ");
					}else {
						break;
					}
				} catch (IllegalArgumentException e) {
					// TODO: handle exception
					System.out.print(e.getMessage());
				}

			} while (true);
			
			if(inputAnswer.toLowerCase().equals("n")) {
				check = false;
			}

		} while (check);

	}

}
