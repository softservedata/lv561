package com.percifalll._11_exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Write a method readNumber(int start, int end),
 *  that read from console integer number and return it, if it is in the range [start...end].
 * If an invalid number or non-number text is read, the method should throw an exception.
 * Using this method write a method main(), that has to enter 10 numbers:
 * 	    a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 */

public class Task2 {
    public static void main(String[] args) {
        try {
            int maxBound = 100;
            int numbersCount = 10;

            int start = 1;
            int end = maxBound - numbersCount;

            int currentNumber;
            for (int i = 0; i < numbersCount; i++){
                currentNumber = readNumber(start, end);
                start = currentNumber;
                end++;
                System.out.println("Number you entered:" + currentNumber);
            }
        }
        catch (InputMismatchException exception){
            System.out.println("This is not a number");
        }
        catch (NoSuchElementException exception){
            System.out.println("The input is exhausted");
        }
        catch (IllegalStateException exception){
            System.out.println("The scanner is closed");
        }
        catch (NumberMissTheBound exception){
            System.out.println("The number misses the bound");
        }



    }

    public static int readNumber(int start, int end) throws NumberMissTheBound, InputMismatchException,
            NoSuchElementException, IllegalStateException {
        System.out.println("Enter your value");
        int value = new Scanner(System.in).nextInt();

        if ( (value > start) && (value < end) ){
            return value;
        } else {
            throw new NumberMissTheBound();
        }
    }

    public static class NumberMissTheBound extends RuntimeException{}
}
