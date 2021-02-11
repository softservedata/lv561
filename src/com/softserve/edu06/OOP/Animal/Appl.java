package com.softserve.edu06.OOP.Animal;

public class Appl {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        // animal crating from interface
        Animal animal3 = new Animal() {
            @Override
            public void voice() {
                System.out.println("animal make a voice");
            }

            @Override
            public void feed() {
                System.out.println("animal is eating");
            }
        };

        // array creating                  // animal1 = cat; animal2; animal3 = interface
        Animal[] animals = new Animal[] {animal1, animal2, cat1, dog1, animal3 };

        int i = 0;
        for (Animal  animal: animals) {
            ++i;
            System.out.println(i+".......................");
            animal.voice();
            animal.feed();
        }






    }
}
