package com.homework9.homework;

/* Create method div(), which calculates the dividing of two double numbers.
 * In main method input 2 double numbers and call this method. Catch all exceptions.
 * Write a method readNumber(int start, int end),
 * that read from console integer number and return it, if it is in the range [start...end].
 * If an invalid number or non-number text is read, the method should throw an exception.
 * Using this method write a method main(), that has to enter 10 numbers:
 * a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 * Refactor your previous homework (1-7) and try to handle all possible exceptions in your code.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*In main method input 2 double numbers and call this method. Catch all exceptions.*/
        System.out.println("In main method input 2 double numbers");

        System.out.println();
    }
        /*Create method div(), which calculates the dividing of two double numbers.*/
    public static double div(double first, double second){
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        return first / second;
    }
    public void readNumber(int start, int end){
        Scanner sc = new Scanner(System.in);
    }
}
