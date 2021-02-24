package com.hw052;

abstract class Person {

    private String name;
    final String TYPE_PERSON = "PEERSON";

    public Person(String name){
        this.name = name;
    }

    public Person() {

    }

    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
