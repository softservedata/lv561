package com.softserve.edu.HW13.PT2;

public enum Type {
	ROSE ("Rose"),
	TULIP ("Tulip"),
	ORHID ("Orhid"),
	SUNFLOWER ("Sunflower");
	String type;
	
	private Type (String type) {
		this.type = type;
		
	}
	@Override
	public String toString() {
		return type;
	}

}
