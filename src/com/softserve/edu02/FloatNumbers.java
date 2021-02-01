package com.softserve.edu02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FloatNumbers {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numbersQuantity = 3;               // here we estimate float numbers quantity to read. Maybe we would like to change quantity int the future.
        double [] array = new double[numbersQuantity]; // declare array and determine his size from previous var

        for (int i = 0; i < numbersQuantity; i++) { // in this loop we will read numbers and put them into array ('array')
            double number = 0.0;
            System.out.println("Enter a float number: ");

            try {
                number = Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                array[i] = number;
            }
        }
            int counterInRange = 0;             // here we make counter initialization to calculate of element of array in range
            for (double floatNumber : array) {
                if (floatNumber <= 5 && floatNumber >= -5) {
                    counterInRange++;
                }
            }
            if (counterInRange == numbersQuantity) {
                System.out.println("ALL float numbers belong to range [-5;5]");
            } else {
                System.out.println("NOT ALL float numbers belong to range [-5;5], only "+counterInRange+" numbers of "+numbersQuantity+" belong to that range");
        }






    }



}
