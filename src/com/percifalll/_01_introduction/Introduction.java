package com.percifalll._01_introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create console application. In method main() write code for solving next tasks:
 *
 * 1) Flower bed is shaped like a circle.
 *    Calculate the perimeter and area by entering the radius.
 *    Output obtained results.
 *
 * 2) Define String variables name and address.
 *    Output question "What is your name?"
 *    Read the value name and output next question: “Where are you live, (name)?".
 *    Read address and write whole information.
 *
 * 3) Phone calls from three different countries are с1, с2 and с3 standard units per minute.
 *    Talks continued t1, t2 and t3 minutes.
 *    How much computer will count for each call separately and all talk together?
 *    Input all source data from console, make calculations and output to the screen.
 */
public class Introduction {
    public static void main(String[] args) throws IOException {
        //first task
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter circle radius:");
        double radius = Double.parseDouble(bufferedReader.readLine());

        System.out.printf(
                "Circle perimeter = %3.2f\nCircle square = %3.2f",
                circlePerimeter(radius),
                circleSquare(radius));
        measure();

        //second task
        stringInsertion(bufferedReader);
        measure();

        //third task
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double [] unitsPerMinute, callsDuration, computerCounts;
        double generalCount;

        unitsPerMinute = new double [3];
        callsDuration = new double [3];
        computerCounts = new double [3];

        System.out.println("Enter units per minute value:");
        for (int i = 0; i < unitsPerMinute.length; i++){
            unitsPerMinute[i] = Double.parseDouble(bufferedReader.readLine());
        }

        System.out.println("Enter phone durations:");
        for (int i = 0; i < callsDuration.length; i++){
            callsDuration[i] = Double.parseDouble(bufferedReader.readLine());
        }

        for (int i = 0; i < computerCounts.length; i++){
            computerCounts[i] = singleCount(unitsPerMinute[i], callsDuration[i]);
        }
        generalCount = generalCount(computerCounts);

        System.out.printf(
                "Computer counts:\n" +
                        "\tfirst\t%3.2f\n" +
                        "\tsecond\t%3.2f\n" +
                        "\tthird\t%3.2f\n" +
                        "\tGeneral\t%3.2f\n",
                computerCounts[0], computerCounts[1], computerCounts[2], generalCount
        );
    }

    /*
     * additional method for measuring
     */
    private static void measure(){ System.out.println("\n\t***\n"); }

    /*
     * first task
     */
    public static double circlePerimeter(double radius){
        return 2.0d * Math.PI * radius;
    }
    public static double circleSquare(double radius){
        return Math.PI * radius * radius;
    }

    /*
     * second task
     */
    public static void stringInsertion(BufferedReader bufferedReader) throws IOException{
        String name, address;

        System.out.print("What's your name? : ");
        name = bufferedReader.readLine();
        System.out.print("Where do you live? :");
        address = bufferedReader.readLine();
        System.out.printf("Your name is %s\nYou live in %s\n", name, address);
    }

    /*
     * third task
     */
    public static double singleCount(double c, double t){
        return c * t;
    }
    public static double generalCount(double [] array){
        double result = 0;
        for (double item : array){
            result += item;
        }
        return result;
    }
}
