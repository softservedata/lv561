package com.homework4.homework;

/*
 * Сreate class Dog with fields name, breed, age.
 * Declare enum for field breed.
 * Create 3 instances of type Dog.
 * Check if there is no two dogs with the same name.
 * Display the name and the kind of the oldest dog.
*/
public class Dog {
    private String name;
    private String breed;
    private int age;

    Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public enum breed {
        AustralianTerrier, AmericanGang, RoughFoxTerrier, IrishWolfhound    }

    public void getOldestDog(Dog firstDog, Dog secondDog, Dog thirdDog ){
        int result = Math.max(thirdDog.getAge(), Math.max(firstDog.getAge(), secondDog.getAge() ));
        System.out.println(result);
    }
    public void getUniName(Dog firstDog, Dog secondDog, Dog thirdDog){
        boolean result = false;
        if(firstDog.getName().equals(secondDog.getName()) || secondDog.getName().equals(thirdDog.getName())
                || firstDog.getName().equals(thirdDog.getName())){
            result = false;
        }else{
            result = true;
        }
        System.out.print(result);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {    this.name = name;    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

public static void main(String[]args){
    Dog firstDog = new Dog("Jik", "AmericanGang", 10);
    Dog secondDog = new Dog("Sam", "RoughFoxTerrier", 8);
    Dog thirdDog = new Dog("Sharp", "IrishWolfhound", 2);
}
}