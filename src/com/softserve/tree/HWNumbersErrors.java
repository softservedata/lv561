package com.softserve.tree;

import java.util.Scanner;

public class HWNumbersErrors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] floats = new float[3];
        System.out.println("Enter 3 float numbers betwen -5 and 5");
        for (int i = 0; i < floats.length; i++) {
            float n = sc.nextFloat();
            if ((n > (-5)) && (n < 5)) {
                floats[i] = n;

            }else {
                System.out.print(n + " - Invalid number");
                System.exit(0);
            }
        }
        for (int i = 0; i < floats.length; i++) {

            System.out.print(floats[i] + "    ");
        }

        //

        int[] ints = new int[3];
        System.out.println("\nEnter 3 integer numbers");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = sc.nextInt();
        }
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (max < ints[i]) {
                max = ints[i];
            }
        }
        System.out.print("Max - " + max);
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (min > ints[i]) {
                min = ints[i];
            }
        }
        System.out.print("\nMin - " + min);
        //

        System.out.print("\nEnter HTTP error code number - ");
        int cod = sc.nextInt();
        switch (cod){
            case 401:System.out.println("Unauthorized"); break;
            case 402:System.out.println("Payment Required"); break;
            case 403:System.out.println("Forbidden"); break;
            case 404:System.out.println("Not Found"); break;
            case 405:System.out.println("Method Not Allowed"); break;
            default:System.out.println("Invalid numbers");
        }
        sc.close();
    }
}

