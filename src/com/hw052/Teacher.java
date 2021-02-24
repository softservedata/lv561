package com.hw052;

public class Teacher extends Staff{

    final String TYPE_PERSON = "TEACHER";

    public Teacher(String name) {
        super(name);
        System.out.println("Type - " + TYPE_PERSON);
    }

    public Teacher() {

    }

    public void print(){
        System.out.print("I am a Teacher");
    }

    public int salary(){
        return 123;
    };
}

