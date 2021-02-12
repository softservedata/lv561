package com.softserve.edu06.OOP.Birds;

public class Swallow extends FlyingBird {

    public Swallow(int eag, Feathers feathers) {
        setFeathers(feathers);
        setLayEggs(eag);
    }

    @Override
    public void fly() {
        System.out.println("Swallow is flying");
    }

    @Override
    public String toString() {
        return "Swallow lays "+getLayEggs()+" per year and it's feather is "+getFeathers();
    }
}
