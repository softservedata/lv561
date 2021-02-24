package com.hw052;

public class Cleaner extends Staff{

    final String TYPE_PERSON = "CLEANER";

    public Cleaner(String name) {
        super(name);
        System.out.println("Type - " + TYPE_PERSON);
    }

    public Cleaner() {

    }

    public void print(){
        System.out.print("I am a Cleaner");
    }

    public int salary(){
        return 111;
    }
}
