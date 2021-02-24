package com.hw032;

public class Dog {

    public String name;
    public String breed;
    public int age;

    Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    };

    public void print(){
        System.out.println(breed);
    }

}
