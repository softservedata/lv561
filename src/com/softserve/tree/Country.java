package com.softserve.tree;


import java.util.Scanner;

enum Continent {
    AFRICA("Africa"),
    EUROPE("Europe"),
    NORTH_AMERICA("North America"),
    SOUTH_AMERICA("South America"),
    ASIA("Asia");

    private String country;

    @Override
    public String toString() {
        return country;
    }

    private Continent(String country) {
        this.country = country;

    }
}


public class Country {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cuntry - ");
        String country = sc.nextLine();
        switch (country) {
            case "ukraine":
            case "germany":
                System.out.println("Continent - " + Continent.EUROPE.toString());
                break;
            case "usa":
                System.out.println("Continent - " + Continent.NORTH_AMERICA.toString());
                break;
            case "brasil":
                System.out.println("Continent - " + Continent.SOUTH_AMERICA.toString());
                break;
            case "turkmenistan":
                System.out.println("Continent - " + Continent.ASIA.toString());
                break;
            case "chad":
                System.out.println("Continent - " + Continent.AFRICA.toString());
                break;
            default: System.out.println("Try again");
        }
        sc.close();
    }
}
