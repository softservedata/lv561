package com.hw052;

abstract class Staff extends Person{

    final String TYPE_PERSON = "STAFF";

    public Staff(String name) {
        super(name);
    }

    public Staff() {

    }

    public abstract int salary();

    public void print(){

    }
}
