package com.collections.generics.hw2;

import java.util.*;

public class Student {
    private String name;
    private int course;

    // Constructors
    public Student() {
        this.name = "no name";
        this.course = 0;
    }
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    // Getters & Setters
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

    /**
     * The printStudents method receives a list
     * of students, course number and prints
     * to the console all students
     * which are taught to this course
     * @param list list of students
     * @param course course number
     */
    public static void printStudents(List<Student> list, int course){
        Iterator<Student> iterator = list.iterator();
        Student student;

        while(iterator.hasNext()){
            student = iterator.next();
            if(student.getCourse() == course)
            System.out.println(student.toString());
        }
    }

    /**
     * The printAllStudents method receives a list
     * of students and prints it to the console
     * @param list list of students
     */
    public static void printAllStudents(List<Student> list){
        Iterator<Student> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    @Override
    public String toString() {
        return "\t" + name + "\t\t" + course;
    }

    public static class ByName implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class ByCourse implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getCourse(), o2.getCourse());
        }
    }

    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();

        list.add(new Student("Petro", 1));
        list.add(new Student("Vasya", 4));
        list.add(new Student("Ivan", 3));
        list.add(new Student("Misha", 2));
        list.add(new Student("Viktor", 2));

        System.out.println("Created list");
        Student.printAllStudents(list);

        System.out.print("\n\n\t***\n\n");

        System.out.println("Ordered by \"name\" list");
        Collections.sort(list, new Student.ByName());
        Student.printAllStudents(list);

        System.out.print("\n\n\t***\n\n");

        System.out.println("Ordered by \"course\" list");
        Collections.sort(list, new Student.ByCourse());
        Student.printAllStudents(list);

        System.out.print("\n\n\t***\n\n");

        System.out.println("Students on 2 course");
        Student.printStudents(list, 2);
    }
}
