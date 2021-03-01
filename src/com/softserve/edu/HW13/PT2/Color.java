package com.softserve.edu.HW13.PT2;

public enum Color {
	WHITE("White"), PINK("Pink"), RED("Red"), BLUE("Blue");

	private String color;

	private Color(String color) {
		this.color = color;
	}

	
	@Override
	public String toString() {
		return this.color;
	}

}
