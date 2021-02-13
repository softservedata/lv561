package com.softserve.edu.HW09.Bird;

public class Chicken extends NonFlyingBird {

	public Chicken() {
		setFeathers("Roosters can usually be differentiated from"
				+ " hens by their striking plumage of long flowing tails and"
				+ " shiny, pointed feathers on their necks (hackles) and backs (saddle)");
		setLayEggs(true);

	}

	public Chicken(String feathers) {
		setFeathers(feathers);
	}

	public void fly() {
		System.out.println("Domestic chickens are not capable of long distance flight");

	}

	@Override
	public String toString() {
		return "Chicken [ feathers - " + getFeathers() + ", lay eags - " + isLayEggs() + "]";

	}

}
