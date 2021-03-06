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
class ColorException extends Exception {
	public ColorException() {
		super();
	}

	public ColorException(String msg) {
		super(msg);

	}

}

class TypeException extends Exception {
	public TypeException() {
		super();
	}

	public TypeException(String msg) {
		super(msg);
	}
}

public class Plant {
	Type type;
	Color color;
	int size;

	public Plant() {
		type = null;
		color = null;
		size = 0;
	}
	
	public Plant(String type, String color, int size) throws TypeException, ColorException {
		this.type = typeStrToEnum(type);
		this.color = colorStrToEnum(color);
		this.size = size;
	}

	public Color colorStrToEnum(String color) throws ColorException {

		switch (color.toLowerCase()) {
		case "white":
			return Color.WHITE;
		case "pink":
			return Color.PINK;
		case "red":
			return Color.RED;
		case "blue":
			return Color.BLUE;
		default:
			throw new ColorException("ERROR: Input only White, Pink, Red, Blue color");
		}

	}

	public Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "rose":
			return Type.ROSE;
		case "tulip":
			return Type.TULIP;
		case "orhid":
			return Type.ORHID;
		case "sunflower":
			return Type.SUNFLOWER;
		default:
			throw new TypeException("ERROR: Input only Rose, Tulip, Orhid, Sunflower plant");
		}

	}

	@Override
	public String toString() {
		return "Plant [type=" + type + ", color=" + color + ", size=" + size + "]";
	}
	

}
