package com.softserve.edu06.OOP.Animal;

public interface Animal {
    void voice();
    void feed();

    default public void running() {
        System.out.println("animal is running");
    }
}
