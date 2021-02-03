package com.company;

public class Main {

    public static void main(String[] args) {
        Dog d1 = new Dog("Arnold", Breed.MALAMUTE, 2);
        System.out.println(d1);
        Dog d2 = new Dog("Dude", Breed.BULLDOG, 5);
        System.out.println(d2);
        Dog d3 = new Dog("Buddy", Breed.TERRIER, 3);
        System.out.println(d3);
//
        d1.isTheSameName(d1, d2);
        d1.getTheOldest(d1, d2, d3);
    }
}
