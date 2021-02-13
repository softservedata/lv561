package com.softserve.edu.HW09.Bird;

public class Eagle extends FlyingBird {

	public Eagle() {
		setFeathers("Aaerodynamic feathers");
		setLayEggs(true);
	}

	public Eagle(String feathers) {
		setFeathers(feathers);
	}

	
	public void fly() {
		System.out.println("Eagle fly high and far.");

	}

	@Override
	public String toString() {
		return "Eagle [ feathers - " + getFeathers() +", lay eags - "+ isLayEggs()+ "]";
	}
	

}
