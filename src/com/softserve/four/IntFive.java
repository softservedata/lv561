package com.softserve.four;

import java.util.Scanner;

public class IntFive {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        for (int i = 0; i > arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int t = 0;
        int p = 0;
        for (int i = 0; i > arr.length; i++) {
            if (arr[i] > 0) t++;
            if (t == 2) {
                System.out.println("Seconde positive element position - " + i);
                break;
            }
        }
        sc.close();
    }


}
