package com.hw053;

public class Main {

    public static void main(String[] args) {

        Bird b1 = new Chicken("Chicken");
        Bird b2 = new Eagle("Eagle");
        Bird b3 = new Swallow("Swallow");
        Bird b4 = new Penguin("Penguin");

        Bird arr[] = new Bird[] {b1, b2, b3, b4};

        for (int i = 0; i < arr.length; i++){
            System.out.println("This is - " + arr[i].getName());
            System.out.print("Fly - ");
            arr[i].fly();
            System.out.println("");
            System.out.print("Feathers - ");
//            arr[i].isFeathers();
            System.out.println(arr[i].isFeathers());
            System.out.print("Lay eggs - ");
            System.out.println(arr[i].isLayEggs());
            System.out.println("------------------------");
        }
    }
}
