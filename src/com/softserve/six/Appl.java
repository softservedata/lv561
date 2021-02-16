package com.softserve.six;

import java.util.ArrayList;
import java.util.List;

public class Appl {
    public static void main(String[] args) {
        List<Student> listSt = new ArrayList<>();
        listSt.add(new Student("Vasja", 2));
        listSt.add(new Student("Kolya", 1));
        listSt.add(new Student("Olya", 1));
        listSt.add(new Student("Vasya",2));
        listSt.add(new Student("Petya", 3));
        listSt.add(new Student("Oleg", 1));
        System.out.println(listSt.toString());

    }
}
