package com.percifalll._05_arrays_loops.practical;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(30) - 15;
        }

        //array
        System.out.println(Arrays.toString(array));

        /**
         * the biggest number
         */
        int maxNumber = array[0];
        for (int item : array){
            if (item > maxNumber) maxNumber = item;
        }
        System.out.println("The biggest number = " + maxNumber);

        /**
         * the sum of positive numbers in the array
         */
        int sum = 0;

        for (int item : array){
            if (item > 0) sum += item;
        }
        System.out.println("The sum of positive numbers in the array = " + sum);

        /**
         * The amount of negative numbers in the array
         */

        int count = 0;

        for (int item : array){
            if (item < 0) count++;
        }
        System.out.println("The amount of negative numbers in the array = " + count);
    }
}
