package com.softserve.edu06.OOP.Birds;

/*Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().
Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
Create array Bird and add different birds to it.
Call fly() method for all of it. Output the
information about each type of created bird.
*/

public abstract class Bird {
    private int layEggs;
    private Feathers feathers;

    public abstract void fly();

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    public Feathers getFeathers() {
        return feathers;
    }

    public void setFeathers(Feathers feathers) {
        this.feathers = feathers;
    }
}
