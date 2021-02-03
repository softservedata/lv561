package com.company;

public class Student {
    private String name;
    private double rating;
    static double avgRating;
    static int count;
//
    static {
    count = 0;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
//
    public Student() {
    }
//

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        count++;
    }
//
    public boolean isBetterStudent(Student s1, Student s2){
        if (s1.getRating() > s2.getRating()) {
            System.out.println(s1.name + " is a better student than " + s2.name);
            return true;
        } else {
            System.out.println(s1.name + " is not a better student than " + s2.name);
            return false;
        }
    }
//

    public static double getAvgRating() {
        return avgRating;
    }

    public static void setAvgRating(int avgRating) {
        Student.avgRating = avgRating;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

//

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", rating=").append(rating);
        sb.append('}');
        return sb.toString();
    }
}
