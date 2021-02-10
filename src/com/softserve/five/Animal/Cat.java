package com.softserve.five.Animal;

public class Cat implements Animal{
    private String name = "NoName";
    public void voice(){
        System.out.println(name + ": 'Myau'.");
    }

    public Cat(String name) {
        this.name = name;
    }

    public void feed() {
        System.out.println(name + ": Eating");
    }
}

