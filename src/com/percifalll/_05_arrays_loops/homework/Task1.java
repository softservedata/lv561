package com.percifalll._05_arrays_loops.homework;

import java.util.Scanner;

/**
 * Ask user to enter the number of month.
 * Read the value and write the amount of days in this month (create array with amount days of each month).
 */
public class Task1 {
    public static void main(String[] args) {
        // task 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter moths number:");
        int monthNumber = scanner.nextInt();

        System.out.println("Your month has " + getDaysFromMonth(monthNumber));
    }

    public static int getDaysFromMonth(int monthNumber){
        int[] months = new int[]{
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        return months[monthNumber - 1];
    }
}
