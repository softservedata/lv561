package com.softserve.edu.HW13.PT2;
/* 
 * Create a class Plant,
 * which includes fields
 * 
 * int size,
 * Color color
 * Type type,
 * and constructor where these fields are initialized.
 * 
 * Color and type are Enum.
 * Override the method toString( ).
 * 
 * Create classes ColorException and TypeException and
 * describe there all possible colors and types of plants.
 * 
 * In the method main create an array of five plants.
 * Check to work your exceptions.

 * 
 * @author Taras Krasitskyi
 *
 */

public class Plant {
	Type type;
	Color color;
	int size;
	
	public Plant() {
		type = null;
		color = null;
		size = 0;
	}
	
	public Color colorStrToEnum(String color) {
		switch (color.toLowerCase()) {
		case "white": 
			return Color.WHITE;
		
		case "pink":
			return Color.PINK;
		
		case "red": 
			return Color.RED;
		
		case "blue": 
			return Color.BLUE;
		

		}
		return null;
	}
	

}
