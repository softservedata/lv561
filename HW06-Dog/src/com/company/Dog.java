package com.company;

enum Breed {
    MALAMUTE, BULLDOG, TERRIER
}

public class Dog {
    private String name;
    private Breed breed;
    private int age;
//
public Dog(String n, Breed b, int a){
    this.name = n;
    this.breed = b;
    this.age = a;
}
public boolean isTheSameName (Dog d1, Dog d2){
    if(d1.getName().equals(d2.getName())){
        System.out.println("There is the same name: " + d1);
        return true;
    } else {
        System.out.println("Just one name like this - " + d1);
        return false;
    }

}
public String getTheOldest (Dog d1,Dog d2,Dog d3){
    if(d1.getAge() > d2.getAge() && d1.getAge() > d3.getAge()) {
        System.out.println(d1.breed + " " + d1.name + " is the oldest dog");
    } else if(d2.getAge() > d1.getAge() && d2.getAge() > d3.getAge()) {
        System.out.println(d2.breed + " " + d2.name + " is the oldest dog");
    } else {
        System.out.println(d3.breed + " " + d3.name + " is the oldest dog");
    }

    return null;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("name='").append(name).append('\'');
        sb.append(", breed=").append(breed);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

}
