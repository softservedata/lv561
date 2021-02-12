package com.softserve.edu06.OOP.Birds;

public class Eagle extends FlyingBird {

    public Eagle(int eag, Feathers feathers) {
    setFeathers(feathers);
    setLayEggs(eag);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public String toString() {
        return "Eagle lays "+getLayEggs()+" per year and it's feather is "+getFeathers();
    }
}
