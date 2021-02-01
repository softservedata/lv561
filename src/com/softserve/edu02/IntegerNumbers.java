package com.softserve.edu02;

import java.util.Scanner;

public class IntegerNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantityNumbers = 3;        // here we write how many numbers we will read

        int[] intArray = new int[quantityNumbers];      // array size
        for (int i = 0; i < quantityNumbers; i++) {       // int this loop we input integers
            int number = 0;
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            intArray[i] = number;
        }
        int max = intArray[0];
        int min = intArray[0];
        for (int i = 0 ; i < intArray.length; i++) { // it this loop we check all elements for min and max
            if (max < intArray[i]) {
                max = intArray[i];
            } else if (min > intArray[i]) {
                min = intArray[i];
            }
        }

        System.out.println("max number is: "+max);
        System.out.println("min number is: "+min);

    }

}
