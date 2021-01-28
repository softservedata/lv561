package com.softserve.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter A -");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter B -");
        int b = Integer.parseInt(br.readLine());
        System.out.println("A+B=" + (a+b));
        System.out.println("A-B=" + (a-b));
        System.out.println("A*B=" + (a*b));
        float res = (float) a / (float) b;
        System.out.println("A/B=" + res);

        System.out.println("\n");
        System.out.print("Set the radius of the flower bed - ");
        int r = Integer.parseInt(br.readLine());
        System.out.println("The perimeter of the flower bed is " + (2*3.14f*r));
        System.out.println("The aria of the flower bed is " + (3.14f*r*r));

        System.out.println("\n");
        System.out.print("What is your name? - ");
        String name = br.readLine();
        System.out.print("Where do you live, " + name + " - ");
        String address = br.readLine();
        System.out.println("Your name is " + name + ". You are from " + address);

        System.out.println("\n");
        System.out.print("Set the cost per minute from first country - ");
        int c1 = Integer.parseInt(br.readLine());
        System.out.print("Set the cost per minute from second country - ");
        int c2 = Integer.parseInt(br.readLine());
        System.out.print("Set the cost per minute from third country - ");
        int c3 = Integer.parseInt(br.readLine());
        System.out.print("Set the call duration from first country - ");
        int t1 = Integer.parseInt(br.readLine());
        System.out.print("Set the call duration from second country - ");
        int t2 = Integer.parseInt(br.readLine());
        System.out.print("Set the call duration from third country - ");
        int t3 = Integer.parseInt(br.readLine());
        System.out.println("Set the call cost from first country is " + (c1*t1) + " standard units");
        System.out.println("Set the call cost from second country is " + (c2*t2) + " standard units");
        System.out.println("Set the call cost from third country is " + (c3*t3) + " standard units");
        System.out.println("Total cost is " + ((t1*c1)+(t2*c2)+(t3*c3)));

    }
}
