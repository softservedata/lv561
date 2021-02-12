package com.softserve.edu06.OOP.Birds;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Bird penguin1 = new Penguin(2, Feathers.SHORT);
        Bird eagle1 = new Eagle(3,Feathers.LONG);
        Bird swallow1 = new Swallow(6, Feathers.MIDDLE);
        Bird checken1 = new Chicken(180, Feathers.SHORT);

        Bird[] birds = new Bird[] {penguin1,eagle1,swallow1,checken1};
        int number = 0;
        for (Bird bird : birds) {
            ++number;
            System.out.println("Bird number "+number+" is : "+bird.getClass().getSimpleName());
            bird.fly();
            System.out.println(bird.toString());
            System.out.println("*****************************");
        }
    }
}
