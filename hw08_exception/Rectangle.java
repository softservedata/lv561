package hw08_exception;

import java.util.Scanner;

/*
 * Practice Task #1. 
 * Create a method for calculating the area of a rectangle 
 * int squareRectangle (int a, int b), 
 * which should throw an exception if the user enters negative value. 
 * Input values a and b from console. 
 * Check the squareRectangle method in the method main. 
 * Check to input nonnumeric value.
 */

public class Rectangle {
	
	static int squareRectangle(int a, int b) throws Exception {		
		if(a < 0 || b < 0)
			throw new Exception("Negative Number Input");
		return a * b;
	}
	

	public static void main(String[] args) throws Exception {		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter width: ");
		int a = in.nextInt();
		System.out.print("Enter length: ");
		int b = in.nextInt();
		in.close();
	
		System.out.println("Area: " + Rectangle.squareRectangle(a, b));
		
	}

}
