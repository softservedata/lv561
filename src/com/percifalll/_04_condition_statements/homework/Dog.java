package com.percifalll._04_condition_statements.homework;

/**
 * Сreate class Dog with fields name, breed, age.
 * 1) Declare enum for field breed.
 * 2) Create 3 instances of type Dog.
 * 3) Check if there is no two dogs with the same name.
 * 4) Display the name and the kind of the oldest dog.
 */
public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog() {
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static enum Breed{
        AKITA("Akita"),
        CHINOOK("Chinook"),
        MALTESE("Maltese"),
        BULLDOG("Bulldog");

        private String name;

        Breed(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
                new Dog("Bob", Breed.AKITA, 5),
                new Dog("Bob", Breed.CHINOOK, 9),
                new Dog("Kurt", Breed.MALTESE, 2)
        };

        for (int i = 0; i < dogs.length; i++){
            for (int j = i; j < dogs.length; j++){
                if (( dogs[i].getName().equals(dogs[j].getName()) )
                        && (i != j) ){
                    System.out.println(
                            "Dogs with the same name - " +
                               dogs[i].getName()
                    );
                }
            }
        }

        int max = dogs[0].getAge();
        Dog theOldestDog = dogs[0];
        for (int i = 0; i < dogs.length; i++) {
            if (max < dogs[i].getAge()){
                max = dogs[i].getAge();
                theOldestDog = dogs[i];
            }
        }

        System.out.println(
                "The oldest dog is " + theOldestDog.getName() + " " + theOldestDog.getBreed()
                );
    }
}
