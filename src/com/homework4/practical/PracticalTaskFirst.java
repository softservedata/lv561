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
 * Enter three numbers. Find out how many of them are odd.
 */

public class PracticalTaskFirst {
    public static void main(String[] args) {
        int[] array = new int[3];
        int result = 0;

        System.out.println("Enter three numbers: ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }   //enter three numbers

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result++;
            }
        }       //how many of them are odd
        System.out.println("Number of odd numbers: " + result);
    }
}
