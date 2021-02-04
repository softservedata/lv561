package com.softserve.edu03_Loops;

import java.util.Arrays;
import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = 10;
        int [] integers = new int[arrayLength];

        // Array creating

        for (int i = 0; i < integers.length; i++) {
            boolean bool = random.nextBoolean();
            integers[i] = ( bool == true) ? random.nextInt(101) : - (random.nextInt(101));
        }

        int max = integers[0];
        int sumPositive = 0;
        int sumNegative = 0;
        int negativeCounter = 0;

        for (int i = 0; i < integers.length; i++) {
            if (max < integers[i]) {
                max = integers[i];
            }
            if (integers[i] >= 0) {
                sumPositive += integers[i];
            } else if (integers[i] < 0) {
                sumNegative += integers[i];
                negativeCounter++;
            }
        }

        System.out.println("Array consist of: "+Arrays.toString(integers));

        System.out.println("Max number in array is:    "+max);
        System.out.println("Sum of positive numbers:   "+sumPositive);
        System.out.println("Sum of negative numbers:   "+sumNegative);
        System.out.println("Negative numbers quantity: "+negativeCounter);
        if (-(sumNegative) > sumPositive) {
            System.out.println("Value of negative numbers is higher for "+(-(sumNegative) - sumPositive));
        } else if (-(sumNegative) < sumPositive){
            int value = -(sumNegative);
            System.out.println("Value of postive numbers is higher for "+(sumPositive - value));
        } else {
            System.out.println("Value of postive and negative numbers is higher aer equal");
        }

    }
}
