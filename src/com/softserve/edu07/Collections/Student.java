package com.softserve.edu07.Collections;

import java.util.*;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return getName();
    }

    public void printStudent(List<Student> students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse()==course) {
                System.out.println(student.toString());
            }
        }
    }

    public static List<Student> sortByName(List<Student> studentList) {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return studentList;
    }

    public static List<Student> sortByCourse(List<Student> studentList) {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getCourse() > o2.getCourse()) {
                    return -1;
                } else if (o1.getCourse() < o2.getCourse()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        return studentList;
    }


    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Vasyl", 5));
        studentList.add(new Student("Petro", 4));
        studentList.add(new Student("Andriy", 3));
        studentList.add(new Student("Myron", 4));
        studentList.add(new Student("Oleg", 2));
        sortByName(studentList);
        sortByCourse(studentList);

        System.out.println(studentList);

    }
}
