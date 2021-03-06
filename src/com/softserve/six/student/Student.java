package com.softserve.six.student;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Student implements Comparable<Student> {
    public static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class ByCours implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCours() - o2.getCours();
        }
    }

    private String name = "NoName";
    private int cours = 0;

    public Student(String name, int cours) {
        this.name = name;
        this.cours = cours;
    }

    public String getName() {
        return name;
    }

    public int getCours() {
        return cours;
    }

    public Student() {

    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cours=" + cours +
                '}';
    }

    public void printStudents(List l, int c) {
        ListIterator<Student> iterS = l.listIterator();
        while (iterS.hasNext()) {
            Student st = iterS.next();
            if (st.getCours() == c) {
                System.out.println(st);
            }
        }
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }
}
