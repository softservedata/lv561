package com.hw042;

public class Car {

    public String type;
    public int year;
    public int engCap;

    Car(String type, int year, int engCap){
        this.type = type;
        this.year = year;
        this.engCap = engCap;
    }

    public void print(){
        System.out.println("Type - " + type);
        System.out.println("Year - " + year);
        System.out.println("Engine capacity - " + engCap + " horsepower");
        System.out.println("----------------------------------");
    }
}
