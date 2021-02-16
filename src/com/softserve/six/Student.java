package com.softserve.six;

import java.util.List;
import java.util.ListIterator;

public class Student {
    private String name = "NoName";
    private int cours = 0;

    public Student(String name, int cours) {
        this.name = name;
        this.cours = cours;
    }

    public Student() {

    }

    public int getCours() {
        return cours;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cours=" + cours +
                '}';
    }

    public void printStudents(List l, int c){
        ListIterator<Student> iterS = l.listIterator();
        while (iterS.hasNext()) {
            Student st = iterS.next();
            if (st.getCours() == c) {
                System.out.println(st);
            }
        }
    }
}
