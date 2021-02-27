package com.softserve.edu.HW13.PT1;
/*-
 * 
 * Create a method for calculating the area of a rectangle 
	int squareRectangle (int a, int b), 
	which should throw an exception if the user enters negative value.
	Input values a and b from console.
	Check the squareRectangle method in the method main.
	Check to input nonnumeric value.

 * @author Taras Krasitskyi
 *
 */

public class SquareRectangle {

	public int squareRectangle(int a, int b) throws Exception {

		if (a >= 0 && b >= 0) {
			return a * b;
		} else {
			//return -1;
			throw new Exception("ERROR: a and b must be >= 0! ");
		
			
		}

	}

}
