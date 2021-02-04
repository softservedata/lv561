package com.conditionStatements;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter country name:");
        String country = scanner.nextLine();
        String result;

        switch (country){
            case "Ukraine":  result = Continents.EUROPE.name(); break;
            case "USA":  result = Continents.NORTH_AMERICA.name(); break;
            case "Brazil":  result = Continents.SOUTH_AMERICA.name(); break;
            case "Australia":  result = Continents.AUSTRALIA.name(); break;
            case "China":  result = Continents.ASIA.name(); break;
            case "Algeria":  result = Continents.AFRICA.name(); break;
            default: result = "NOT_FOUND";
        }
        System.out.print(result);
    }

    public enum Continents{
        ASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, EUROPE, AUSTRALIA, ANTARCTICA;
    }
}
