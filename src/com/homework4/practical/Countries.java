package com.homework4.practical;

import java.util.Scanner;
/*
 * @author Vitalii Kryshtop
 * @version java 15.0
 *
 * 15.04.2021
 *
 */

/**
 * Enter the name of the country. Print the name of the continent.
 * (Declare enum with names of continents)
 */

enum Continents {
    EUROPE, NORTH_AMERICA, AFRICA, ASIA, SOUTH_AMERICA, OCEANIA;
}       //Declare enum with names of continents

public class Countries {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter country: ");
        String input = sc.nextLine();       //Enter the name of the country.

        switch (input) {
            case "Ukraine":
                System.out.println(Continents.EUROPE.toString());
                break;
            case "USA":
                System.out.println(Continents.NORTH_AMERICA.toString());
                break;
            case "Mongolia":
                System.out.println(Continents.ASIA.toString());
                break;
            case "Somali":
                System.out.println(Continents.AFRICA.toString());
                break;
            default:
                System.out.println("False entered country");
                break;
        }
        sc.close();
    }       //Print the name of the continent
}


