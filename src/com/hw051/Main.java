package com.hw051;

public class Main {

    public static void main(String[] args) {

        Animal animals[] = new Animal[4];

        animals[0] = new Cat("Myrka");
        animals[1] = new Cat("Vasyl");
        animals[2] = new Dog("Rex");
        animals[3] = new Dog("Roki");

        // Як звернутись до імені тваринки???

        for (int i = 0; i < animals.length; i++){
            if (i == 0){
                System.out.print("Cat Myrka");
                animals[i].feed();
                animals[i].voice();
            }else if (i == 1){
                System.out.print("Cat Vasyl");
                animals[i].feed();
                animals[i].voice();
            }else if (i == 2){
                System.out.print("Dog Rex");
                animals[i].feed();
                animals[i].voice();
            }else if (i == 3){
                System.out.print("Dog Roki");
                animals[i].feed();
                animals[i].voice();
            }

        }

    }
}
