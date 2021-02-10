package com.softserve.four;

import java.util.Scanner;

public class FirstNegat {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            if (n >= 0) {
                arr[i] = n;
            } else break;
        }
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod = prod * arr[i];
        }
        System.out.println(prod);
        sc.close();
    }
}