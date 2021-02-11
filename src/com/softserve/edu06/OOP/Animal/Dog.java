package com.softserve.edu06.OOP.Animal;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("bark");
    }

    @Override
    public void feed() {
        System.out.println("dog is eating dog's food");
    }
}
