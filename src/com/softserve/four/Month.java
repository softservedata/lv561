package com.softserve.four;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter number ot the month(1-12) - ");
        int num = sc.nextInt();
        System.out.print("Days in the month - " + month[num]);
        sc.close();
    }
}

