package com.softserve.four;

import java.util.Scanner;

public class IntFive {
    public static void main(String[] args) {
        /*{1, -2, -3, 4, 5};*/
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println(" ");
        int t = 0;
        int max = arr[0];
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                t++;
                if (t == 2) {
                    System.out.println("Second positive element position - " + (i + 1));
                }
            }
            if (max < arr[i]) {
                max = arr[i];
                p = i;
            }
        }
        System.out.println("max-" + max + " position-" + (p + 1));
        sc.close();
    }

}


