package com.homework7.past2;
import java.util.*;

/*      Write class Student that provides information about the name of the student and his course.
        Class Student should consist of
        1)properties for access to these fields
        2)constructor with parameters
*/

public class Student  implements  Comparable<Student> {

    public static class ByName implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getName().compareTo(st2.getName());
        }
    }

    public static class ByCourse implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            return st1.getCourse() - st2.getCourse();
        }
    }

    public static class ByNameAndCourse implements Comparator<Student> {
        @Override
        public int compare(Student st1, Student st2) {
            int byName = st1.getName().compareTo(st2.getName());
            return byName == 0 ? st1.getCourse() - st2.getCourse() : byName;
        }
    }

    private int course;
    private String name;

    public Student(int course, String name) {
        this.course = course;
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "course=" + course +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.getName());
        // return course - student.getCourse();
    }

    /*  method printStudents (List students, Integer course),
        which receives a list of students and the course number and
        prints to the console the names of the students from the list,
        which are taught in this course (use an iterator)
        methods to compare students by name and by course
*/

    public static void printStudents(List<Student> lstStr) {
        List students = new ArrayList(lstStr);
        Iterator iterator = students.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println("Original: students = " + students);
            Collections.sort(students, new Student.ByNameAndCourse());
            System.out.println("Sorter: students = " + element);
        }

    }
}








