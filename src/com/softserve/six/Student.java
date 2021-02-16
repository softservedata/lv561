package com.softserve.six;

import java.util.List;

public class Student {
    private String name = "NoName";
    private int cours = 0;

    public Student(String name, int cours) {
        this.name = name;
        this.cours = cours;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cours=" + cours +
                '}';
    }

    public void printStudents(List l, int c){
        System.out.println("");
    }
}
