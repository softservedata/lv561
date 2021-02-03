package com.company;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Harry Potter",62);
        System.out.println("Student 1: " + s1);
        Student s2 = new Student("Hermione Granger", 134);
        System.out.println("Student 2: " + s2);
        Student s3 = new Student("Ronald Weasley", 49);
        System.out.println("Student 3: " + s3);
//

        boolean b = s1.isBetterStudent(s2, s3);

        int i = s1.getCount();

        double total = s1.getRating() + s2.getRating() + s3.getRating();
        double avgRating = (total / i);
        System.out.println("Total rating: " + total + "\nAverage rating: " + avgRating);
    }
}
