package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main (String[] args) throws InputMismatchException {
	// TASKS:
        // 1)
//        int a, b;
//        a = 10;
//        b = 10;
//
//        int res = a + b;
//        System.out.println("a + b = " + res);
//
//        int res2 = a - b;
//        System.out.println("a - b = " + res2);
//
//        int res3 = a / b;
//        System.out.println("a / b = " + res3);
//
//        int res4 = a * b;
//        System.out.println("a * b = " + res4);
//
//        2)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How are you?");
//        String answer = sc.nextLine();
//        System.out.println("You are " + answer);
//        sc.close();
//
//        HomeWork:
//        1)
//        double radius, area;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the radius of the circle");
//        radius = sc.nextDouble();
//        sc.close();
//        area = Math.PI * radius * radius;
//        System.out.println("area of the circle is " + area);
//
//        2)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = sc.nextLine();
//        System.out.println("Where do you live, " + name + "?");
//        String address = sc.nextLine();
//        System.out.println("You are " + name);
//        System.out.println("You live on " + address);
//        sc.close();
//
//        3)
//        Countries
//        String c1, c2, c3;
//        c1 = "Ukraine - Ukraine";
//        c2 = "Poland - Ukraine";
//        c3 = "Hungary - Ukraine";
////        Time
//        int t1, t2, t3;
//        t1 = 23;
//        t2 = 53;
//        t3 = 13;
////        How much per minute
//        int price1 = 0;
//        int price2 = 2;
//        float price3 = 2.5f;
////        How much for each call
//        int sum1 = t1 * price1;
//        System.out.println("Call Ukraine - Ukraine cost: " + sum1);
//        int sum2 = t2 * price2;
//        System.out.println("Call Poland - Ukraine cost: " + sum2);
//        float sum3 = t3 * price3;
//        System.out.println("Call Hungary - Ukraine cost: " + sum3);
////        How much at all
//        float sum4 = sum1 + sum2 + sum3;
//        System.out.println("How much computer will count for all talks together: " + sum4);

        Scanner sc = new Scanner(System.in);
        System.out.println("What country? ");
        String c1 = sc.nextLine();
//
        System.out.println("How long? ");
        int t1 = sc.nextInt();
//
        System.out.println("How much for a minute? ");
        int price1 = sc.nextInt();
//
        System.out.println("For this country: " + c1);
        System.out.println("For this long: " + t1 + " min");
        System.out.println("With this price: " + price1 + " hrn/min");
        int sum = t1 * price1;
        System.out.println("The call will cost this much: " + sum + " hrn");

//
        Scanner sc2 = new Scanner(System.in);
        System.out.println("What country? ");
        String c2 = sc2.nextLine();
//
        System.out.println("How long? ");
        int t2 = sc2.nextInt();
//
        System.out.println("How much for a minute? ");
        int price2 = sc2.nextInt();
//
        System.out.println("For this country: " + c2);
        System.out.println("For this long: " + t2 + " min");
        System.out.println("With this price: " + price2 + " hrn/min");
        int sum2 = t2 * price2;
        System.out.println("The call will cost this much: " + sum2 + " hrn");

//
        Scanner sc3 = new Scanner(System.in);
        System.out.println("What country? ");
        String c3 = sc3.nextLine();
//
        System.out.println("How long? ");
        int t3 = sc3.nextInt();
//
        System.out.println("How much for a minute? ");
        int price3 = sc3.nextInt();
//
        System.out.println("For this country: " + c3);
        System.out.println("For this long: " + t3 + " min");
        System.out.println("With this price: " + price3 + " hrn/min");
        int sum3 = t3 * price3;
        System.out.println("The call will cost this much: " + sum3 + " hrn");
//
        int sum4 = sum + sum2 + sum3;
        System.out.println("All calls cost this much: " + sum4 + " hrn");
//
        sc.close();
        sc2.close();
        sc3.close();

    }
}
