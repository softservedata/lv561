package com.softserve.hw06;

import java.util.Scanner;

enum Continents {
	EUROPA("Europa"),
	ASIA("Asia"),
	NORTH_AMERICA("North America"),
	SOUTH_AMERICA("South America"),
	AUSTRALIA("Australia"),
	AFRICA("Africa");
	
	private String name;
	//
	private Continents(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class App3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Country = ");
		String country = sc.nextLine();
		switch (country) {
		case "Germany":
		case "France":
		case "Englang":
		case "Poland":
		case "Ukraine":
			System.out.println("This is " + Continents.EUROPA.toString());
			break;
		case "Canada":
		case "USA":
			System.out.println("This is " + Continents.NORTH_AMERICA.toString());
			break;
		case "Brasil":
		case "Argentina":
			System.out.println("This is " + Continents.SOUTH_AMERICA.toString());
			break;
		case "Marocco":
		case "Egypt":
			System.out.println("This is " + Continents.AFRICA.toString());
			break;
		case "Australia":
			System.out.println("This is " + Continents.AUSTRALIA.toString());
			break;
		case "China":
		case "Japan":
			System.out.println("This is " + Continents.ASIA.toString());
			break;
		default:
			System.out.println("Error");
		}
		sc.close();
	}

}
