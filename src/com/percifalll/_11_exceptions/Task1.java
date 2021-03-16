package com.percifalll._11_exceptions;

/**
 * Create method div(), which calculates the dividing of two double numbers.
 * In main method input 2 double numbers and call this method.
 * Catch all exceptions.
 */
public class Task1 {
    public static void main(String[] args) {
        double a;

        try{
           a = (div(2, 0.0));
        }
        catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
            a = 0;
        }
        System.out.println(a);

    }

    public static double div(double a, double b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Divide by 0");
        }
        return a/b;
    }


}
