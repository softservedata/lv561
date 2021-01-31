package com.softserve.edu02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNumbers {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbersArray = new int[3]; // array declaration and initialization for following numbers that would be entered
        int counter = 0;
        while (counter != 3) {
            System.out.println("Enter number: ");
            try {
                numbersArray[counter] = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            counter++;
        }

        int oddQuantity = 0;  // counter for odd numbers
        for (int number : numbersArray) {
            if (number % 2 != 0) {              // here we check if number in array odd
                oddQuantity++;                  // ood counter incrementation
            }
        }

        switch (oddQuantity) {
            case 0:
                System.out.println("You have been entered 0 (zero) odd numbers");
                break;
            case 1:
                System.out.println("You have been entered only 1 (one) odd number");
                break;
            case 2:
                System.out.println("You have been entered 2 (two) odd numbers");
                break;
            case 3:
                System.out.println("You have been entered 3 (three) odd numbers");
                break;
        }

    }
}
