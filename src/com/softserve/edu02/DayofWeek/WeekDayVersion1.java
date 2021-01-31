package com.softserve.edu02.DayofWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekDayVersion1 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a day of week: ");
        int dayOfWeek = 0; // var declaration
        try {
            dayOfWeek = Integer.parseInt(reader.readLine());  // enter number of week day
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (dayOfWeek < 1 || dayOfWeek > 7) {
            System.out.println("You have entered wrong number. Try again and rerun app");
        }
        switch (dayOfWeek) {            // We want to show information normally : First letter Capital, and other lowercase letters.
            case 1:
                String ukrName = UkrainianDaysName.ПОНЕДІЛОК.toString();
                String ukrNamePrint = ukrName.substring(0,1).toUpperCase()+ukrName.substring(1).toLowerCase();
                    System.out.println(ukrNamePrint);
                String itName = ItalianDaysName.LUNEDI.toString();
                String itNamePrint = itName.substring(0,1).toUpperCase()+itName.substring(1).toLowerCase();
                    System.out.println(itNamePrint);
                String engName = EnglishDaysName.MONDAY.toString();
                String engNamePrint = engName.substring(0,1).toUpperCase()+engName.substring(1).toLowerCase();
                    System.out.println(engNamePrint);
                    break;
            case 2:
                ukrName = UkrainianDaysName.ВІВТОРОК.toString();
                ukrNamePrint = ukrName.substring(0,1).toUpperCase()+ukrName.substring(1).toLowerCase();
                    System.out.println(ukrNamePrint);
                itName = ItalianDaysName.MARTEDI.toString();
                itNamePrint = itName.substring(0,1).toUpperCase()+itName.substring(1).toLowerCase();
                    System.out.println(itNamePrint);
                engName = EnglishDaysName.TUESDAY.toString();
                engNamePrint = engName.substring(0,1).toUpperCase()+engName.substring(1).toLowerCase();
                    System.out.println(engNamePrint);
                    break;
            case 3:
                ukrName = UkrainianDaysName.СЕРЕДА.toString();
                ukrNamePrint = ukrName.substring(0,1).toUpperCase()+ukrName.substring(1).toLowerCase();
                    System.out.println(ukrNamePrint);
                itName = ItalianDaysName.MERCOLEDI.toString();
                itNamePrint = itName.substring(0,1).toUpperCase()+itName.substring(1).toLowerCase();
                    System.out.println(itNamePrint);
                engName = EnglishDaysName.WEDNESDAY.toString();
                engNamePrint = engName.substring(0,1).toUpperCase()+engName.substring(1).toLowerCase();
                    System.out.println(engNamePrint);
                    break;
            case 4:
                ukrName = UkrainianDaysName.ЧЕТВЕР.toString();
                ukrNamePrint = ukrName.substring(0,1).toUpperCase()+ukrName.substring(1).toLowerCase();
                    System.out.println(ukrNamePrint);
                itName = ItalianDaysName.GIOVEDI.toString();
                itNamePrint = itName.substring(0,1).toUpperCase()+itName.substring(1).toLowerCase();
                    System.out.println(itNamePrint);
                engName = EnglishDaysName.THURSDAY.toString();
                engNamePrint = engName.substring(0,1).toUpperCase()+engName.substring(1).toLowerCase();
                    System.out.println(engNamePrint);
                    break;
            case 5:
                ukrName = UkrainianDaysName.ПЯТНИЦЯ.toString();
                ukrNamePrint = ukrName.substring(0,1).toUpperCase()+ukrName.substring(1).toLowerCase();
                    System.out.println(ukrNamePrint);
                itName = ItalianDaysName.VENERDI.toString();
                itNamePrint = itName.substring(0,1).toUpperCase()+itName.substring(1).toLowerCase();
                    System.out.println(itNamePrint);
                engName = EnglishDaysName.FRIDAY.toString();
                engNamePrint = engName.substring(0,1).toUpperCase()+engName.substring(1).toLowerCase();
                    System.out.println(engNamePrint);
                    break;
            case 6:
                ukrName = UkrainianDaysName.СУБОТА.toString();
                ukrNamePrint = ukrName.substring(0,1).toUpperCase()+ukrName.substring(1).toLowerCase();
                    System.out.println(ukrNamePrint);
                itName = ItalianDaysName.SABATO.toString();
                itNamePrint = itName.substring(0,1).toUpperCase()+itName.substring(1).toLowerCase();
                    System.out.println(itNamePrint);
                engName = EnglishDaysName.SATURDAY.toString();
                engNamePrint = engName.substring(0,1).toUpperCase()+engName.substring(1).toLowerCase();
                    System.out.println(engNamePrint);
                    break;
            case 7:
                ukrName = UkrainianDaysName.НЕДІЛЯ.toString();
                ukrNamePrint = ukrName.substring(0,1).toUpperCase()+ukrName.substring(1).toLowerCase();
                    System.out.println(ukrNamePrint);
                itName = ItalianDaysName.DOMENICA.toString();
                itNamePrint = itName.substring(0,1).toUpperCase()+itName.substring(1).toLowerCase();
                    System.out.println(itNamePrint);
                engName = EnglishDaysName.SUNDAY.toString();
                engNamePrint = engName.substring(0,1).toUpperCase()+engName.substring(1).toLowerCase();
                    System.out.println(engNamePrint);
                    break;

        }
    }
}
