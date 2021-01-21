package com.softserve.edu01.Abc;

/**
 * 
 * @author Lv-561.JavaCore
 *
 */
public class App {

	/**
	 * @param args <font color="red">Command <b>Line</b></font> Arguments.
	 */
	public static void main(String[] args) {
		/*
		 * Multi line comment.
		 */
		byte b = 49;
		/*-
		System.out.println("b = " + b);
		char c = (char) b;
		*/
		System.out.println("symbol = " + (char) b);
		// Example
		b = -5;
		System.out.println("b = " + b);
		System.out.printf("b = %h", b);
		//
//		String s = "123";
//		b = (byte)s; // Compile Error;
	}
}
