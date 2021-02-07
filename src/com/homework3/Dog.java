package com.homework3;

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
}
