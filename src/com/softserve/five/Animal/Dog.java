package com.softserve.five.Animal;

public class Dog implements Animal {
    private String name = "NoName";

    public void voice() {
        System.out.println(this.name + ": 'Gav'.");
    }

    public Dog(String name) {
        this.name=name;
    }
    public void feed() {
        System.out.println(name + ": Eating");
    }
}
