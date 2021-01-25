package com.firsthome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.
            final double Pi = 3.14;
            System.out.println("Input r");
            int r = Integer.parseInt(br.readLine());

            System.out.println("Довжина кола " + 2 * Pi * r + " cm");
            System.out.println("S = " + Pi * r * r + " cm^2");

        //Define String variables name and address. Output question "What is your name?"
        // Read the value name and output next question: “Where are you live, (name)?". Read address and write whole information.
            System.out.println("What is your name?");
            String name = br.readLine();
            System.out.println("Where are you live " + name + "?");
            String address = br.readLine();

            System.out.println("My name is " + name);
            System.out.println("I live in " + address);

        //Phone calls from three different countries are с1, с2 and с3 standard units per minute. Talks continued t1, t2 and t3 minutes.
        // How much computer will count for each call separately and all talk together?
        // Input all source data from console, make calculations and output to the screen.
            System.out.println("Input c1");
            int c1 = Integer.parseInt(br.readLine());
            System.out.println("Input c2");
            int c2 = Integer.parseInt(br.readLine());
            System.out.println("Input c3");
            int c3 = Integer.parseInt(br.readLine());
            System.out.println("Input t1");
            int t1 = Integer.parseInt(br.readLine());
            System.out.println("Input t2");
            int t2 = Integer.parseInt(br.readLine());
            System.out.println("Input t3");
            int t3 = Integer.parseInt(br.readLine());

            System.out.println("c1*t1=" + c1*t1);
            System.out.println("c2*t2=" + c2*t2);
            System.out.println("c3*t3=" + c3*t3);
            System.out.println("Cost of all conversations is " + (c1*t1+c2*t2+c3*t3) + " dollars");

    }
}
