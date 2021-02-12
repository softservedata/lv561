package com.softserve.edu06.OOP.Birds;

public class Chicken extends NonFlyingBird {

    public Chicken(int eag, Feathers feathers) {
        setFeathers(feathers);
        setLayEggs(eag);
    }

    @Override
    public void fly() {
        System.out.println("Chicken is flying");
    }


    @Override
    public String toString() {
        return "Chicken lays "+getLayEggs()+" per year and it's feather is "+getFeathers();
    }
}
