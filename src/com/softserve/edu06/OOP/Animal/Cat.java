package com.softserve.edu06.OOP.Animal;

public class Cat implements Animal {
    @Override
    public void feed() {
        System.out.println("cat is eating cat's food");
    }

    @Override
    public void voice() {
        System.out.println("moew");
    }
}
