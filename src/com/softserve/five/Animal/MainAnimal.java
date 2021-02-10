package com.softserve.five.Animal;

public class MainAnimal {
    public static void main(String[] args) {
        Animal a1 = new Dog("Jack");
        Animal a2 = new Cat("Sonya");
        Animal a3 = new Dog("Bob");
        Animal a4 = new Dog("Frank");
        Animal a5 = new Cat("Jim");
        Animal[] arr = new Animal[]{a1, a2, a3, a4, a5};

        for (int i=0;i< arr.length; i++) {
            arr[i].feed();
            arr[i].voice();
        }
    }
}
