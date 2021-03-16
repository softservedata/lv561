package com.percifalll._05_arrays_loops.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Enter 5 integer numbers. Find
 * position of second positive number;
 * minimum and its position in the array.
 * Organize entering integers until the first negative number.
 * Count the product of all entered even numbers.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] ints = new int[5];

        System.out.println("Enter your numbers");
        for (int i = 0; i < ints.length; i++){
            System.out.print(i + 1 + ":");
            ints[i] = scanner.nextInt();
        }

        // 3.1
        System.out.println(
                "Position of second positive number = " +
                findNsPosNum(ints, 2));
        // 3.2
        int[] minAndPos = findMinPos(ints);
        System.out.println(
                "Minimum and its number:\n" +
                "min = " + minAndPos[0] + "\n" +
                "pos = " + minAndPos[1]
        );
        // 3.3
        System.out.println(Arrays.toString(ints));
        organizeUntilNegElem(ints);
        System.out.println(Arrays.toString(ints));
        // 3.4
        System.out.println("Product of all entered even numbers = " + productOfEvenNums(ints));
    }

    public static int findNsPosNum(int[] array, int orderPosition){
        int i = 0;

        for (int elem : array){
            if (elem > 0){
                i++;
            }
            if ((elem > 0) && (i == orderPosition)){
                return elem;
            }
        }
        return 0;
    }

    public static int[] findMinPos(int[] array){
        int min = array[0];
        int position = 0;

        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
                position = i;
            }
        }

        return new int[] {min, position};
    }

    public static int findFirstNegElem(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0){
                return i;
            }
        }
        return -1;
    }

    public static void organizeUntilNegElem(int[] array){
        int negIndex = findFirstNegElem(array);

        if (negIndex > 1){
            for (int i = 0; i < negIndex - 1; i++){
                for (int j = i + 1; j < negIndex; j++){
                    if (array[i] > array[j]) {
                        int tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }
            }
        }
    }

    public static int productOfEvenNums(int[] array){
        int product = 1;

        for (int elem : array){
            if (elem % 2 == 0){
                product *= elem;
            }
        }

        return product;
    }
}
