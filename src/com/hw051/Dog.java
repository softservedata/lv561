package com.hw051;

public class Dog implements Animal{

    String name;

    public void voice(){
        System.out.print(" and says gav");
        System.out.println("\n----------------------------");
    }
    public void feed(){
        System.out.print(" is hungry");
    }

    Dog(String name) {
        this.name = name;
    }
}
