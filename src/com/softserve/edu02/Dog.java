package com.softserve.edu02;

public class Dog {

    private String name;
    private Breed breed;
    private int age;

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

    public static void main(String[] args) {

        Dog dog1 = new Dog("Barsik",Breed.WORKING,5);
        Dog dog2 = new Dog("Adolf", Breed.SPORTING,8);
        Dog dog3 = new Dog("Barsik", Breed.NONSPORTING, 7);
        Dog[] dogArray = new Dog[] {dog1,dog2,dog3};                    // put dog instance to array

        int max = dogArray[0].age;
        int nameMatchCounter = 0;                           // declare var for calculate how many time dogs name will be matched

        for (int i = 0; i < dogArray.length; i++) {
            for (int j = i+1; j < dogArray.length; j++) {
                if (dogArray[i].name.equals(dogArray[j].name)) {
                    nameMatchCounter++;
                }
            }
            if (max < dogArray[i].age) {
                max = dogArray[i].age;
            }
        }
        if (nameMatchCounter > 0) {
            System.out.println("At a least two dogs exist with the same name");
        } else {
            System.out.println("No dogs with the same name");
        }


        String name = "";

        for (Dog dog : dogArray) {
            if (dog.age == max) {
                name = dog.breed.toString();
                String toPrint = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase(); // we will write breed in normal view
                System.out.println("The oldest dog's name is: "+dog.name);
                System.out.println("That dog's breed is: "+toPrint);

            }
        }






    }

    public enum Breed {
        SPORTING, HOUND, WORKING, TERRIER, TOY, NONSPORTING, HERDING
    }
}
