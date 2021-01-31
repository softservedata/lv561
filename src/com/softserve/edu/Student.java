package com.softserve.edu;

public class Student {
    private String name;
    private int rating;
    private static double avgRating;
    private static int studentQuantity;
    private static int ratingSum;

    static {
        avgRating = 0;
        studentQuantity = 0;
    }

    public Student() {
        studentQuantity++;

    }
    public Student(String name, int rating) {
        this();
        this.name = name;
        this.rating = rating;
        ratingSum+=this.rating;
        avgRating =ratingSum*1.0/studentQuantity;
    }

    public boolean betterStudent (Student student1, Student student2) {
        return (student1.rating > student2.rating) ? true: false;
    }

    @Override
    public String toString() {
        return "Student "+name+" has "+rating+" rating";
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ivanenko",4);
        Student student2 = new Student("Pavlenko",4);
        Student student3 = new Student("Vasylenko",5);
        Student[] students = new Student[] {student1,student2,student3};
        double average = 0.0;

        for (Student student: students) {
            average += student.rating;
        }
        average = average*1.0/students.length;

        // CrossCheck results
        if (average == avgRating) {
            System.out.println("Avarage rating of students: "+average+" and total rating(sum of all students rates: "+ratingSum);
        }
    }
}
