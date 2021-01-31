package com.softserve.edu02.DayofWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WeekDayVersion2 {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
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
        dayOfWeek = dayOfWeek-1;

        Object [] ukrDaysArray = Arrays.stream(UkrainianDaysName.values()).toArray();
        Object [] itDaysArray = Arrays.stream(ItalianDaysName.values()).toArray();
        Object [] engDaysArray = Arrays.stream(EnglishDaysName.values()).toArray();

        String ukrDay = ukrDaysArray[dayOfWeek].toString();
        String itDay = itDaysArray[dayOfWeek].toString();
        String engDay = engDaysArray[dayOfWeek].toString();

        String[] toRead = new String[] {ukrDay,itDay,engDay};

        for (String day : toRead) {
            System.out.println(day.substring(0,1).toUpperCase()+day.substring(1).toLowerCase());
        }

    }

}
