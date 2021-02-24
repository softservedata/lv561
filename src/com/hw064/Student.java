package com.hw064;

public class Student {
    private String name = "";
    private int course = 1;

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

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
    public Student(){

    }

    public void print(){
        System.out.print("This is " + getName() + ", he is studying on " + getCourse() + " course");
    }


    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
