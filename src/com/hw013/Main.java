package com.hw013;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

	    int c1, c2, c3;      //dolars per minute
        int t1, t2, t3;      //minutes
        int p1, p2, p3, p4;  //call prise

        System.out.print("c1 - ");
        Scanner c11 = new Scanner(System.in);
        c1 = c11.nextInt();
        System.out.print("c2 - ");
        Scanner c22 = new Scanner(System.in);
        c2 = c22.nextInt();
        System.out.print("c3 - ");
        Scanner c33 = new Scanner(System.in);
        c3 = c33.nextInt();

        System.out.print("t1 - ");
        Scanner t11 = new Scanner(System.in);
        t1 = t11.nextInt();
        System.out.print("t1 - ");
        Scanner t22 = new Scanner(System.in);
        t2 = t22.nextInt();
        System.out.print("t1 - ");
        Scanner t33 = new Scanner(System.in);
        t3 = t33.nextInt();

        p1 = c1 * t1;
        p2 = c2 * t2;
        p3 = c3 * t3;
        p4 = p1 + p2 + p3;

        System.out.println("You were speaking at the rate c1 during t1 minutes, it will cost - " + p1 + " dolars");
        System.out.println("You were speaking at the rate c2 during t2 minutes, it will cost - " + p2 + " dolars");
        System.out.println("You were speaking at the rate c3 during t3 minutes, it will cost - " + p3 + " dolars");
        System.out.println("Together it will cost - " + p4 + " dolars");

    }
}
