package com.hw052;

public class Student extends Person {

    final String TYPE_PERSON = "STUDENT";

    public Student(String name) {
        super(name);
        System.out.println("Type - " + TYPE_PERSON);
    }

    public Student() {
        super();
    }

    public void print(){
        System.out.print("I am a Student");
    }

}
