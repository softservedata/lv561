package com.softserve.edu06.OOP.Birds;

public abstract class NonFlyingBird extends Bird {

    @Override
    public void fly() {
        System.out.println("not-flaying");
    }
}
