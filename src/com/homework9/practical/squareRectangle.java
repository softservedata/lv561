package com.homework9.practical;

/*
 * Create a method for calculating the area of a rectangle int squareRectangle (int a, int b),
 * which should throw an exception if the user enters negative value.
 * Input values a and b from console. Check the squareRectangle method in the method main.
 * Check to input nonnumeric value.
 */

import java.util.Scanner;


public class squareRectangle {
    public static void main(String[] args){
        squareRectangle rectangle = new squareRectangle();
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter a: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Enter b: ");
            int b = Integer.parseInt("Enter b: ");
            System.out.println("area of a rectangle: " + rectangle.squareRectangle(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int squareRectangle (int a, int b) throws Exception{
        if(a >= 0 && b >=0){
            return a * b;
        }else{
            throw new Exception("a & b >= 0");
        }
    }
}

