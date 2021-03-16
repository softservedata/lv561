package com.percifalll._05_arrays_loops.homework;

import java.util.Scanner;

/**
 * Enter 10 integer numbers.
 * Calculate the sum of first 5 elements if they
 * are positive or product of last 5 element in the other case.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] ints = new int[10];

        // getting user input
        System.out.println("Enter 10 array values:");
        for (int i = 0; i < ints.length; i++){
            System.out.print((i + 1) + ":");
            ints[i] = scanner.nextInt();
        }

        int count = 5;
        if (checkFirstPosElems(ints, count)){
            System.out.println(
                    "First " + count + " elements sum = " +
                            sumFirstElems(ints, count)
            );
        } else{
            System.out.println(
                    "Last " + count + " elements product = " +
                            productLastPosElems(ints, count)
            );
        }
    }

    public static boolean checkFirstPosElems(int[] array, int count){
        for (int i = 0; i < count; i++){
            if (array[i] < 0){
                return false;
            }
        }
        return true;
    }

    public static int sumFirstElems(int[] array, int count){
        int sum = 0;

        for(int i = 0; i < count; i++){
            sum += array[i];
        }

        return sum;
    }

    public static int productLastPosElems(int[] array, int count) {
        int product = 1;

        for (int i = array.length - 1; i >= array.length - count; i--) {
            product *= array[i];
        }

        return product;
    }
}
