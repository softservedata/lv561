package hw08_exception;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Homework Task.
 * Create method div(), which calculates the dividing of two double numbers. 
 * In main method input 2 double numbers and call this method. 
 * Catch all exceptions. 
 * Write a method readNumber(int start, int end), that read from console integer number and return it, if it is in the range [start...end]. 
 * If an invalid number or non-number text is read, the method should throw an exception. 
 * Using this method write a method main(), that has to enter 10 numbers:
 * 	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 */

public class Calculator {

	public static double div(double a, double b) {	
		return a / b;
	}

	public static int readNumber(int start, int end) throws MyException {
		int x = start;
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter number: ");
			x = in.nextInt();

			if (x < start || x > end) {
				throw new MyException();
			}
		} catch (Exception e) {
			System.err.println("Ivalid input");
		}
		return x;
	}

	public static int[] main() throws MyException {
		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) { 
			arr[i] = readNumber(0, 100);
			if(arr[i] < 0 || arr[i] > 100) {
				break;
			} 			
		}	
		
		for(int i = 0; i < 10; i++) {
			if(arr[i] > 0 && arr[i] < 100) {
				Arrays.sort(arr);
				return arr;
			} 
		}
		return null;
		
	}

	public static void main(String[] args) {

		// method div()
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter first number: ");
			double a = in.nextDouble();
			System.out.print("Enter second number: ");
			double b = in.nextDouble();
			System.out.println("div() = " + Calculator.div(a, b));
		} catch (Exception e) {
			System.err.println("Invalid data");
		}

		// method readNumber()
		try {
			Calculator.readNumber(0, 100);
		} catch (MyException e) {
			e.printStackTrace();
		}

		// method main() to enter 10 numbers
		try {			
			Calculator.main();
		} catch (MyException e) {
			e.printStackTrace();
		}

	}
}



class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyException() {}
	
}
