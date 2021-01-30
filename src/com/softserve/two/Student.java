package com.softserve.two;

public class Student {
    private String name;
    private int rating;
    private static float avrRating;
    public static float a = 0;
    private static int n = 0;

    public Student() {
    }

    public Student(String n, int r) {
        this.name = n;
        this.rating = r;
        a = a + r;
        this.n++;
    }

    public boolean betterStudent(Student a, Student b) {
        return (a.rating > b.rating);
    }

    public String toString() {
        return "Student's name - " + name + ", Rating - " + rating;
    }

    public float getAvrRating() {
        avrRating = a / (float) n;
        return avrRating;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Kolya", 3);
        Student st2 = new Student("leha", 12);
        Student st3 = new Student("Vasya", 5);
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
        System.out.println("Student st1 better than st2 - " + st1.betterStudent(st1, st2));
        System.out.println("Average rating - " + st2.getAvrRating());
    }
}

