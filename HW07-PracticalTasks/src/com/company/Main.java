package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] numbers = {23, 43, 12, -19, 21, 54, 11, -20, 9, 3};

//      The biggest number of Array:
        int max = numbers[0];
        int i = 0;
        while (i < numbers.length){
            if (numbers[i] > max){
                max = numbers[i];
            }
            i++;
        }
        System.out.println("The biggest number is " + max);
//      A sum of the positive numbers:
        int sum = 0;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Sum of positive numbers = " + sum);

//      The amount of negative numbers
        int amountNeg = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] < 0){
                amountNeg++;
            }
        }
        System.out.println("The amount of negative numbers = " + amountNeg);
//      The amount of positive numbers
        int amountPos = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > 0){
                amountPos++;
            }
        }
        System.out.println("The amount of positive numbers = " + amountPos);
//        What values there are more: negative or positive?
        if(amountNeg > amountPos) {
            System.out.println("There are more negative numbers");
        } else if (amountNeg < amountPos) {
            System.out.println("There are more positive numbers");
        }
    }
}
