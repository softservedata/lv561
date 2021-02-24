package com.hw032;

//      Що це за жовті помилки?

enum Breed {

    GERMAN_SHEPHERD("German Shepherd"),
    ENGLISH_BULLDOG("English Bulldog"),
    ROTTWEILER("Rottweiler");

    private String breed;

    private Breed(String breed){
        this.breed = breed;
    }

    public String toString(){
        return breed;
    }
}

public class Main {
    public static void main(String[] args) {

    int y = 3, out = 0;
    float arr[] = new float[y];

    arr[0] = 4.5f;
    arr[1] = -6.8f;
    arr[2] = 1.9f;

    for (int i = 0; i < y; i++){

        if (arr[i] <= -5 || arr[i] >= 5){
            out++;
        }
    }

    if (out == 0){
        System.out.println("All belongs to the range");
    }else {
        System.out.println("There is " + out + " number(s), that is out of range");
    }

    System.out.println("--------------------------------------------------");

    int x = 3, maxi, mini;
    int ar[] = new int[x];

    ar[0] = 163;
    ar[1] = 54;
    ar[2] = 120;

    maxi = ar[0];
    mini = ar[0];


        for (int t = 0; t < x; t++) {

            if (maxi < ar[t]) {
                maxi = ar[t];
            }
        }
        System.out.println("Max integer number - " + maxi);

        for (int t = 0; t < x; t++){
            if (mini > ar[t]){
                mini = ar[t];
            }
        }
        System.out.println("Min integer number - " + mini);
        System.out.println("--------------------------------------------------");

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

        Dog Rex = new Dog("Rex", Breed.GERMAN_SHEPHERD.toString(), 3);
        Dog Roki = new Dog("Roki", Breed.ENGLISH_BULLDOG.toString(), 5);
        Dog Vova = new Dog("Vova", Breed.ROTTWEILER.toString(), 8);
        Dog[] dogs = {Rex, Roki, Vova};
        for ()

        System.out.println("Dog - " + Rex.name);
        System.out.println("Breed - " + Rex.breed);
        System.out.println("Age - " + Rex.age);
        System.out.println("--------------------------------------------------");

        System.out.println("Dog - " + Roki.name);
        System.out.println("Breed - " + Roki.breed);
        System.out.println("Age - " + Roki.age);
        System.out.println("--------------------------------------------------");

        System.out.println("Dog - " + Vova.name);
        System.out.println("Breed - " + Vova.breed);
        System.out.println("Age - " + Vova.age);
        System.out.println("--------------------------------------------------");

//        Що робити, якби тут було більше собак??

        if (Rex.name == Roki.name){
            System.out.println(Rex.name + " and " + Roki.name + " have the same names");
            System.out.println("--------------------------------------------------");
        }else if (Roki.name == Vova.name){
            System.out.println(Roki.name + " and " + Vova.name + " have the same names");
            System.out.println("--------------------------------------------------");
        }else if (Vova.name == Rex.name){
            System.out.println(Vova.name + " and " + Rex.name + " have the same names");
            System.out.println("--------------------------------------------------");
        }else {
            System.out.println("There is no 2 dogs with same names");
            System.out.println("--------------------------------------------------");
        }

        int k = 3, max;
        int a[] = new int[k];

        a[0] = Rex.age;
        a[1] = Roki.age;
        a[2] = Vova.age;
        max = a[0];

        for (int l = 0; l < k; l++) {

            if (max < a[l]) {
                max = a[l];
            }
        }

        if (max == Rex.age){
            System.out.println("The oldest dog - " + Rex.name);
            System.out.println("His age - " + Rex.age);
            System.out.println("His breed - " + Rex.breed);
            System.out.println("--------------------------------------------------");
        }else if (max == Roki.age){
            System.out.println("The oldest dog - " + Roki.name);
            System.out.println("His age - " + Roki.age);
            System.out.println("His breed - " + Roki.breed);
            System.out.println("--------------------------------------------------");
        }else if (max == Vova.age){
            System.out.println("The oldest dog - " + Vova.name);
            System.out.println("His age - " + Vova.age);
            System.out.println("His breed - " + Vova.breed);
            System.out.println("--------------------------------------------------");
        }
    }
}
