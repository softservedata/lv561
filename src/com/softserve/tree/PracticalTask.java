package com.softserve.tree;

import java.util.Arrays;
import java.util.Scanner;


public class PracticalTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array - ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print("Enter the element of the array ["+i+"] - ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int j = 0;
        for (int e : arr) {

            if (e % 2 != 0) {
                j++;
            }

        }
        System.out.println("Number of odd elements - "+j);
        sc.close();

    }
}
