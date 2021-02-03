package com.softserve.tree;

enum Breed {
    SHEPHERD , BULLDOG,  TERRIER
}

public class Dog {
    private String name;
    private Breed breed;
    private int age;
    public Dog(String n, Breed b, int a){
        this.age = a;
        this.name = n;
        this.breed = b;
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("jack", Breed.BULLDOG, 10);
        Dog d2 = new Dog("jack", Breed.TERRIER, 14);
        Dog d3 = new Dog("bakie", Breed.SHEPHERD, 19);
        Dog d4 = new Dog("frank", Breed.SHEPHERD, 9);
        Dog[] dogs = new Dog[] {d1,d2,d3,d4};

        Dog m = dogs[0];

        for (int i=0; i<dogs.length - 1 ; i++){
            if (dogs[i].name.equals(dogs[i+1].name)) {
            System.out.println("name match found");
            }
            if (dogs[i].getAge() < dogs[i+1].getAge()){
                m = dogs[i+1];
            }
        }
        System.out.print("Older dog - " + m.toString());
    }
}
