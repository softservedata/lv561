package com.percifalll._05_arrays_loops.homework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Create class Car with fields type, year of production and engine capacity.
 * Create and initialize four instances of class Car. Display cars
 * certain model year  (enter year in the console);
 * ordered by the field year.
 */
public class Car {
    private String type;
    private int year;
    private int engineCapacity;

    public Car() {
    }

    public Car(String type, int year, int engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public static void orderByYear(Car[] cars){
        for (int i = 0; i < cars.length - 1; i++){
            for (int j = i + 1; j < cars.length; j++){
                if (cars[i].getYear() > cars[j].getYear()){
                    Car tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
    }

    public static Car[] findByYear(Car[] array, int year){
        List<Car> list = new LinkedList<Car>();

        for (int i = 0; i < array.length; i++){
            if (array[i].getYear() == year){
                list.add(array[i]);
            }
        }

        Car[] result = new Car[list.size()];

        for (int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }

        return result;
    }

    @Override
    public String toString() {
        return type + " " + year + " " + engineCapacity;
    }

    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("FD", 2001, 550),
                new Car("UF", 2012, 600),
                new Car("BT", 2000, 490),
                new Car("VD", 2019, 660)
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cars year:");
        int year = scanner.nextInt();

        // 4.1
        System.out.println(Arrays.toString(findByYear(cars, year)) );
        // 4.2
        System.out.println("Cars ordered by the field year");
        orderByYear(cars);
        for (Car elem : cars){
            System.out.println(elem);
        }
    }
}
