package com.softserve.four;

import java.util.Locale;
import java.util.Scanner;

public class Car {

    enum Type {
        JEEP,
        SEDAN,
        HETCHBACK,
        PICKUP


    }

    private Type type;
    private int year = 0;
    private int engCap = 0;

    public Car(Type type, int year, int engCap) {
        this.engCap = engCap;
        this.year = year;
        this.type = type;
    }

    public Car() {
    }


    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", year=" + year +
                ", engCap=" + engCap +
                '}';
    }

    public static void main(String[] args) {
        Car bmw = new Car(Type.PICKUP, 1988, 2000);
        Car mers = new Car(Type.JEEP, 2020, 2500);
        Car kia = new Car(Type.HETCHBACK, 2001, 1300);
        Car mg = new Car(Type.SEDAN, 1999, 1900);
        Car[] arr = new Car[]{bmw, mg, mers, kia};
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].year == year) {
                System.out.println(arr[i].toString());
            }

        }
        Car buf = new Car();
        buf = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].year>arr[j+1].year){
                    buf = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buf;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
        sc.close();
    }
}
