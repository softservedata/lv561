package com.softserve.edu06.OOP.Birds;

public class Penguin extends NonFlyingBird {

    public Penguin(int eag, Feathers feathers) {
        setFeathers(feathers);
        setLayEggs(eag);
    }

    @Override
    public void fly() {
        System.out.println("Penguin is flying");
    }

    @Override
    public String toString() {
        return "Penguin lays "+getLayEggs()+" per year and it's feather is "+getFeathers();
    }
}
