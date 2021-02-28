package com.homework4.practical;

//Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
import java.util.Scanner;

    enum Continents {
        EUROPE, NORTH_AMERICA, AFRICA, ASIA, SOUTH_AMERICA, OCEANIA;
    }

    public class Countries {
          public void continent() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter country: ");
            String input = sc.nextLine();

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
          }
    }


