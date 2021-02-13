package com.softserve.edu.HW09.Bird;

public class Penguin extends NonFlyingBird {

	public Penguin() {
		setFeathers("Thick layer of insulating feathers that keeps them warm in water");
		setLayEggs(true);
	}

	public Penguin(String feathers) {
		setFeathers(feathers);
	}

	public void fly() {
		System.out.println("Penguins are a group of aquatic flightless birds");

	}

	@Override
	public String toString() {
		return "Penguin [ feathers - " + getFeathers() +", lay eags - "+ isLayEggs()+ "]";
	}
	
	

}
