package com.softserve.edu02;


import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //we create 4 list of countries
        String [] europeListCountries = new String[] {"Germany", "France","Poland","Portugal","Spain", "Ukraine", "Italy", "Austria", "Great Britain", "Norway",
        "Finland", "Austria", "Hungary", "Croatia", "Netherlands", "Denmark", "Island", "Sweden", "Switzerland", "Belgium", "Latvia","Lithuania", "Estonia",
        "Belarus", "Moldova", "Bulgaria", "Romania", "Slovenia", "Czech Republic", "Ireland", "Slovakia", "Serbia", "Bosnia and Herzegovina", "Albania"};
        String [] americaListCountries = new String[] {"USA","Canada","Mexico", "Cuba", "Domenic Republic", "Haiti", "Guatemala", "Chili", "Brazil", "Argentina",
        "Bolivia", "Columbia", "Venezuela", "Panama", "Ecuador", "Puerto Rico", "Jamaica", "Paraguay", "Uruguay", };
        String [] africaListCountries = new String[] {"Marocco", "Egypt", "Tanzania", "Chad", "South Africa", "Nigeria", "Ethiopia", "Somali", "Algeria",
        "Ghana", "Kenya", "Senegal", "Uganda", "Sudan", "Zambia", "Camerun", "Livia"};
        String [] asiaListCountries = new String[] {"Russia", "China", "Japan", "South Korea", "North Korea", "Indonesia", "Mongolia", "Kazakhstan", "Saudi Arabia",
        "Iran", "India", "Iraq", "Thailand", "Singapore", "Israel" };



        System.out.println("Enter country name: ");
        String wordInput = scanner.nextLine();
        String checkWord = "";

        for (int i = 0; i < africaListCountries.length; i++) {
            if (wordInput.equals(africaListCountries[i])) {
                checkWord = "Africa";
            }
        }
        for (int i = 0; i < americaListCountries.length; i++) {
            if (wordInput.equals(americaListCountries[i])) {
                checkWord = "America";
            }
        }
        for (int i = 0; i < asiaListCountries.length; i++) {
            if (wordInput.equals(asiaListCountries[i])) {
                checkWord = "Asia";
            }
        }
        for (int i = 0; i < europeListCountries.length; i++) {
            if (wordInput.equals(europeListCountries[i])) {
                checkWord = "Europa";
            }
        }
        if (wordInput.equals("Australia")) {
            checkWord = "Australia";
        }

        switch (checkWord) {
            case "Europa":
                System.out.println("Entered country "+wordInput+" belong to "+Continentals.EUROPE.toString()+" continental");
                break;
            case "Asia":
                System.out.println("Entered country "+wordInput+" belong to "+Continentals.ASIA.toString()+" continental");
                break;
            case "Africa":
                System.out.println("Entered country "+wordInput+" belong to "+Continentals.AFRICA.toString()+" continental");
                break;
            case "America":
                System.out.println("Entered country "+wordInput+" belong to "+Continentals.AMERICA.toString()+" continental");
                break;
            case "Australia":
                System.out.println("Entered country "+wordInput+" belong to "+Continentals.AUSTRALIA.toString()+" continental");
                break;
            default:
                System.out.println("You entered wrong country name or our system not updated yet");
                break;
        }

    }

    public enum Continentals {
        AMERICA, EUROPE, AFRICA, ASIA, AUSTRALIA;
    }
}
