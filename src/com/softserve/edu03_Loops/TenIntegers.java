package com.softserve.edu03_Loops;

import java.util.Scanner;

public class TenIntegers {
    public static int INTEGERS_QUANTITY;
    public static int[] INTEGERS_ARRAY;

    static {
        INTEGERS_QUANTITY = 10;
        INTEGERS_ARRAY = new int[INTEGERS_QUANTITY];
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < INTEGERS_ARRAY.length; i++) {
                System.out.println("Enter numbers: ");
            try {
                INTEGERS_ARRAY[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Something went wrong. Check if enter integers");
            }
        }
        scanner.close();

        int sum = 0;
        int multiplication = 1;
        int counter = 0;


        for (int i = 0; i < INTEGERS_ARRAY.length; i++) {
            if (INTEGERS_ARRAY[i] > 0 && i < 5) {
                sum += INTEGERS_ARRAY[i];
                counter++;
            }
            if (counter < 6 && i >= 5) {
                multiplication = multiplication*INTEGERS_ARRAY[i];
            }
        }

        if (counter == 5) {
            System.out.println("Sum of first 5 elements: "+sum);
        } else {
            System.out.println("Product of last 5 elements "+multiplication);
        }

    }
}
