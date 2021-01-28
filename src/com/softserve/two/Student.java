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
}

