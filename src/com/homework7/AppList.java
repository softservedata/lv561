package com.homework7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
In the main() method
declare List students and add to the list five different students
display the list of students ordered by name
display the list of students ordered by course.
*/

public class AppList {
    public static void main(String[] args) {
        List<Student> lstStr = new ArrayList<>();
        lstStr.add(new Student(2, "Petro"));
        lstStr.add(new Student(3, "Stepan"));
        lstStr.add(new Student(4, "Petro"));
        lstStr.add(new Student(7, "Ira"));
        lstStr.add(new Student(3, "Ivan"));


        System.out.println("Original: lstStr = " + lstStr);
        Collections.sort(lstStr, new Student.ByName());

        System.out.println("\nSorted: lstStr = " + lstStr);
        Collections.sort(lstStr, new Student.ByCourse());
    }
}

