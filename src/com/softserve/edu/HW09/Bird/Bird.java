package com.softserve.edu.HW09.Bird;

/*-
 * Develop abstract class Bird with attributes
 * feathers
 * and layEggs
 * and an abstarct method fly(). 
 */
public abstract class Bird {

	private String feathers;
	private boolean layEggs;

	public abstract void fly();

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

}
