package com.softserve.edu.HW09.Bird;

public class Swallow extends FlyingBird {
	
	public Swallow () {
		setFeathers("The wings are long, pointed, and have nine primary feathers.");
		setLayEggs(true);
	}
	
	public Swallow (String feather) {
		setFeathers(feather);
	}
	
	public void fly() {
		System.out.println("Swallows are excellent flyers, and use these skills to feed and attract mates.");
		
	}

	@Override
	public String toString() {
		return "Swallow [ feathers - " + getFeathers() +", lay eags - "+ isLayEggs()+ "]";
	}
	

}
