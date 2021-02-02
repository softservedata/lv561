package com.softserve.edu.HW06;

import java.util.Scanner;

/**
 * -
 * 
 * @author taras Krasitskyi
 * 
 *         Enter the name of the country. Print the name of the continent.
 *         (Declare enum with names of continents)
 *
 * 
 */

enum Continents {
	AFRICA("Africa"), NORTH_AMERICA("North America"), SOUTH_AMERICA("South America"), ANTARCTICA("Antarctica"),
	ASIA("Asia"), AUSTRALIA("Australia"), EUROPE("Europe");

	private String name;

	private Continents(String name) {
		this.name = name;

	}

	@Override
	public String toString() { // no automatic genereted;;;;
		return name;
	}

}

public class Country {
	public static void main(String[] args) {
		//Continents continents = Continents.AFRICA;
		//System.out.println(continents.name());
		//System.out.println(continents);
		
		System.out.print("Input country: ");
		Scanner sc = new Scanner (System.in);
		
		switch( (sc.nextLine() ).toUpperCase() ) {
		case "UKRAINE":
		case "POLAND":
			System.out.println("This is a "+Continents.EUROPE);
			break;
		case "USA":
		case "CANADA":
			System.out.println("This is a "+Continents.NORTH_AMERICA);
			break;
		}
		
	
		sc.close();

	}

}
